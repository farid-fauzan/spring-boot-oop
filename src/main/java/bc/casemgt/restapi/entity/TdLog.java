package bc.casemgt.restapi.entity;

import lombok.*;
import springfox.documentation.spring.web.json.Json;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TdLog", schema = "case_management")
public class TdLog implements Serializable {

    //CREATE TABLE case_management.td_log (
    //	id_log varchar(250) NOT NULL,
    @Id
    @Column(name = "id_log", nullable = false)
    private String idLog;


    //	id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;
    //	status_awal varchar(250) NULL,
    @Column(name = "status_awal", nullable = true)
    private String statusAwal;
    //	status_akhir varchar(250) NULL,
    @Column(name = "status_akhir", nullable = true)
    private String statusAkhir;
    //	data_awal json NULL,
    @Column(name = "data_awal", columnDefinition = "JSON",nullable = true)
    private String dataAwal;
    //	data_akhir json NULL,
    @Column(name = "data_akhir", nullable = true)
    private String dataAkhir;

    //	keterangan varchar(250) NULL,
    @Column(name = "keterangan", nullable = true)
    private String keterangan;
    //	nip_rekam varchar(250) NULL,
    @Column(name = "nip_rekam", nullable = true)
    private String nipRekam;
    //	waktu_rekam timestamp NULL,
    @Column(name = "waktu_rekam", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuRekam;
}

