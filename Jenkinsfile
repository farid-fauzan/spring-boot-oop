pipeline {
    agent any
    environment {
        PATH = "/usr/local/go/bin:$PATH"
        DOCKER_IMAGE_NAME = "drc01dev01hrbr.customs.go.id/library/inhouse-db-narkotik-service"
        HARBOR_CREDENTIAL_ID = 'harbor_dev'
        KUBECONFIG_CREDENTIAL_ID = credentials('kubeconfig_dev01')
        REGISTRY = 'drc01dev01hrbr.customs.go.id'
        HARBOR_NAMESPACE = 'library'
        APP_NAME = 'narkotik'
        NAMESPACE = 'inhouse-db-narkotik-service'
        YAML_FILE = 'kubernetes.yaml'
		URL_SVC =''
        PORT = '8090'
        CHANGE_CAUSE = 'V.01'
        //THUNDERSCAN_API_URL = "https://sast.customs.go.id/"
        //THUNDERSCAN_API_TOKEN = "7318bfae126551905df3dd60645fcd32e7a73485c22f7cd884f7e92e1aee8581"
        //THUNDERSCAN_ACCEPT_SELF_SIGNED_CERT = 'true'

    }

    stages {
		stage ('Checkout SCM') {
            steps {
                checkout(scm)
            }
        }
        
        //stage('Thunderscan') {
            //when {
                //branch 'develop-oracle'
            //}
            //steps {
                //sh '''#!/bin/bash
                 //wget https://download.defensecode.com/latest/clients/tscli.tar.gz -O tscli.tar.gz && tar xvzf tscli.tar.gz && ./tscli --upload "$WORKSPACE" --threshold "low:16" --engines "1" --report --formats "html,json" --filename "thunderscan-report"
                //'''
                //}
            //}

        stage('Build Docker Image') {
            when {
                branch 'develop'
            }
            steps {
                script {
                   sh "docker build -t ${DOCKER_IMAGE_NAME}:${BUILD_NUMBER} -f Dockerfile ."

                }
            }
        }
        stage('Push Docker Image') {
            when {
                branch 'develop'
            }
            steps {
                script {
                    docker.withRegistry('https://' + REGISTRY, HARBOR_CREDENTIAL_ID) {                   
                        //app.push("${env.BUILD_NUMBER}")
                        //app.push("latest")
                        //app.push()
                        sh "docker push ${DOCKER_IMAGE_NAME}:${BUILD_NUMBER}"
                    }
                }
            }
        }
        stage('DeployToPKS') {
            when {
                branch 'develop'
            }
            steps {
                sh "envsubst < $YAML_FILE | kubectl apply -f - --kubeconfig $KUBECONFIG_CREDENTIAL_ID"
            }
        }
        stage('Get Service IP') {
            when {
                branch 'develop'
            }
            steps {
                //milestone(1)
                retry(10) {
                    withCredentials([usernamePassword(credentialsId: 'pks_client_dev', usernameVariable: 'USERNAME', passwordVariable: 'USERPASS')]) {
                        script {

                            //sh "sshpass -p '$USERPASS' -v ssh -o StrictHostKeyChecking=no $USERNAME@$pks_client \"kubectl get all -l app=simplereact -o wide\""

                            //untuk ing
                            //def host = sh (script: "sshpass -p '$USERPASS' -v ssh -o StrictHostKeyChecking=no $USERNAME@$pks_client \"kubectl get ing simplereact --output=jsonpath={'.status.loadBalancer.ingress[].ip'}\"", returnStdout: true)

                            //untuk loadbalancer
                            def ip = sh (script: "sshpass -p '$USERPASS' -v ssh -o StrictHostKeyChecking=no $USERNAME@$pks_client_dev \"kubectl -n $NAMESPACE get svc $APP_NAME --output=jsonpath={'.status.loadBalancer.ingress[].ip'}\"", returnStdout: true)
							sh 'sleep 5'

                            //untuk loadbalancer
                            echo "IP is ${ip}"
                            URL_SVC = "URL is http://${ip}:$PORT"

                            //untuk ingress
                            //echo "host is ${host}"
                            //echo "URL is http://${host}:$PORT"
                            //URL_SVC = "URL is http://${host}:$PORT"
                            echo "$URL_SVC"



                            try {
                             //echo sh(script: "sshpass -p '$USERPASS' -v ssh -o StrictHostKeyChecking=no $USERNAME@$kube-master-ip ls -la", returnStdout: true)
                             //sh "sshpass -p '$USERPASS' -v ssh -o StrictHostKeyChecking=no $USERNAME@$kube-master-ip \"/usr/bin/touch /tmp/jenkins\""
                            } catch (err) {
                             echo: 'caught error: $err'
                            }
                        }
                    }
                }
            }
        }
		stage('Set Annotation') {
            when {
                branch 'develop'
            }
            steps {
                //milestone(1)
                retry(10) {
                    withCredentials([usernamePassword(credentialsId: 'pks_client_dev', usernameVariable: 'USERNAME', passwordVariable: 'USERPASS')]) {
                        script {
                            //sh "sshpass -p '$USERPASS' -v ssh -o StrictHostKeyChecking=no $USERNAME@$pks_client \"kubectl get all -l app=simplereact -o wide\""

                            //untuk loadbalancer
                            //def ip = sh (script: "sshpass -p '$USERPASS' -v ssh -o StrictHostKeyChecking=no $USERNAME@$pks_client \"kubectl -n $NAMESPACE get svc $APP_NAME --output=jsonpath={'.status.loadBalancer.ingress[].ip'}\"", returnStdout: true)

                            //untuk ingress
                            //def host = sh (script: "sshpass -p '$USERPASS' -v ssh -o StrictHostKeyChecking=no $USERNAME@$pks_client \"kubectl annotate deployment simplereact -n default kubernetes.io/change-cause=testfromjenkins --record=false --overwrite=true\"", returnStdout: true)
                            def host = sh (script: "sshpass -p '$USERPASS' -v ssh -o StrictHostKeyChecking=no $USERNAME@$pks_client_dev \"kubectl -n $NAMESPACE annotate deployment $APP_NAME kubernetes.io/change-cause=$CHANGE_CAUSE --record=false --overwrite=true\"", returnStdout: true)

                            sh 'sleep 5'

                            //untuk loadbalancer
                            //echo "IP is ${ip}"
                            //echo "URL is http://${ip}:3001"

                            //untuk ingress
                            //echo "host is ${host}"
                            //echo "URL is http://${host}:80"

                            try {
                             //echo sh(script: "sshpass -p '$USERPASS' -v ssh -o StrictHostKeyChecking=no $USERNAME@$kube-master-ip ls -la", returnStdout: true)
                             //sh "sshpass -p '$USERPASS' -v ssh -o StrictHostKeyChecking=no $USERNAME@$kube-master-ip \"/usr/bin/touch /tmp/jenkins\""
                            } catch (err) {
                             echo: 'caught error: $err'
                            }
                        }
                    }
                }
            }
        }
    }

    post {
        success {
		emailext (
                subject: "Job '${env.JOB_NAME} ${env.BUILD_NUMBER}' succeeded",
                body: "<b>Check console output at <a href=${env.BUILD_URL}>${env.JOB_NAME}</a></b> <br/>$URL_SVC<br/><br/>Annotation = $CHANGE_CAUSE <br/><br/> *do not reply, this message automatically send by Jenkins Job <br/> Thanks.",
                to: "arief.kharisma@nashta.co.id",
                from: "Jenkins Dev Notification <tes@customs.go.id>",
                mimeType: 'text/html'
				)
        }
        failure {
		emailext (
                subject: "Job '${env.JOB_NAME} ${env.BUILD_NUMBER}' FAILED",
                body: "<b>Check console output at <a href=${env.BUILD_URL}>${env.JOB_NAME}</a></b> <br/><br/><br/> *do not reply, this message automatically send by Jenkins Job <br/> Thanks.",
                to: "arief.kharisma@nashta.co.id",
                from: "Jenkins Dev Notification <tes@customs.go.id>",
                mimeType: 'text/html'
				)
        }
    }

}
