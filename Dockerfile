FROM maven:3.8.3-openjdk-16
ENV MAVEN_HOME=/usr/share/maven
ENV TZ="Asia/Jakarta"
RUN date
RUN mkdir -p /app && chmod -R 777 /app
WORKDIR /app

COPY . /app

RUN ${MAVEN_HOME}/bin/mvn clean package -Dmaven.test.skip=true
# RUN wget -q https://repo1.maven.org/maven2/io/prometheus/jmx/jmx_prometheus_javaagent/0.15.0/jmx_prometheus_javaagent-0.15.0.jar

# environment variable with default value

ENV SPRING_PROFILE=dev

EXPOSE 8090
CMD [ "java","-Xmx512m", "-jar", "/app/target/restapi-0.0.1-SNAPSHOT.jar", "--server.servlet.context-path=/"]