package bc.casemgt.restapi.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "td_tugas", schema = "case_management")
public class TdTugas implements Serializable {

    //    id_tugas varchar(250) NOT NULL,
    @Id
    @Column(name = "id_tugas", nullable = false)
    private String idTugas;

//    id_probis varchar(250) NULL,
    @Column(name = "id_probis", nullable = true)
    private String idProbis;

//    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;

//    uraian text NULL,
    @Column(name = "uraian", nullable = true)
    private String uraian;

//    keterangan text NULL,
    @Column(name = "keterangan", nullable = true)
    private String keterangan;

//    nip_rekam varchar(18) NULL,
    @Column(name = "nip_rekam", nullable = true)
    private String nipRekam;

//    waktu_rekam timestamp NULL,
    @Column(name = "waktu_rekam", nullable = true)
    private Date waktuRekam;

//    nip_update varchar(18) NULL,
    @Column(name = "nip_update", nullable = true)
    private Date nipUdate;

//    waktu_update timestamp NULL,
    @Column(name = "waktu_update", nullable = true)
    private Date waktuUpdate;

}
