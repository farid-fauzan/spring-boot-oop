package bc.casemgt.restapi.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "informasi", schema = "case_management")
public class Informasi implements Serializable {

//    id_ikhtisar_informasi varchar(250) NULL,

    @Id
    @Column(name = "id_ikhtisar_informasi", nullable = false)
    private String idIkhtisarInformasi;
    //    id_probis varchar(250) NULL,

    @Column(name = "id_probis", nullable = false)
    private String idProbis;
    //    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = false)
    private String idHeader;
//    informasi text NULL,
    @Column(name = "informasi", nullable = false)
    private String informasi;
//    kode_sumber varchar(5) NULL,
    @Column(name = "kode_sumber", nullable = false)
    private String kodeSumber;
//    kode_validitas varchar(5) NULL,
    @Column(name = "kode_validitas", nullable = false)
    private String kodeValiditas;
//    nip_rekam varchar(250) NULL,
    @Column(name = "nip_rekam", nullable = false)
    private String nipRekam;
//    waktu_rekam timestamp NULL,
    @Column(name = "waktu_rekam", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuRekam;


}

