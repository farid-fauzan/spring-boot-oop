package bc.casemgt.restapi.entity;

import lombok.*;

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
@Table(name = "td_informasi", schema = "case_management")
public class TdInformasi implements Serializable {

    //CREATE TABLE case_management.td_informasi (
    //	id_ikhtisar_informasi varchar(250) NULL,
    @Id
    @Column(name = "id_ikhtisar_informasi", nullable = false)
    private String idIkhtisarInformasi;

    //	id_probis varchar(250) NULL,
    @Column(name = "id_probis", nullable = true)
    private String idProbis;
    //	id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;
    //	informasi text NULL,
    @Column(name = "informasi", nullable = true)
    private String informasi;
    //	kode_sumber varchar(5) NULL,
    @Column(name = "kode_sumber", nullable = true)
    private String kodeSumber;
    //	kode_validitas varchar(5) NULL,
    @Column(name = "kode_validitas", nullable = true)
    private String kodeValiditas;
    //	nip_rekam varchar(250) NULL,
    @Column(name = "nip_rekam", nullable = true)
    private String nipRekam;
    //	waktu_rekam timestamp NULL,
    @Column(name = "waktu_rekam", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuRekam;
    //	nip_update varchar(250) NULL,
    @Column(name = "nip_update", nullable = true)
    private String nipUpdate;
    //	waktu_update timestamp NULL
    @Column(name = "waktu_update", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuUpdate;
}
