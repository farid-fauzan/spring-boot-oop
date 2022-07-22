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
@Table(name = "td_nota_profil", schema = "case_management")
public class TdNotaProfil implements Serializable {
//    id_np varchar(250) NOT NULL,
    @Id
    @Column(name = "id_np", nullable = false)
    private String idNp;

//    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;

//    jenis_dokumen varchar(250) NULL,
    @Column(name = "jenis_dokumen", nullable = true)
    private String jenisDokumen;

//    nomor_dokumen varchar(250) NULL,
    @Column(name = "nomor_dokumen", nullable = true)
    private String nomorDokumen;

//    tanggal_dokumen varchar(250) NULL,
    @Column(name = "tanggal_dokumen", nullable = true)
    private String tanggalDokumen;

//    perihal varchar(250) NULL,
    @Column(name = "perihal", nullable = true)
    private String perihal;

//    jenis_profil varchar(250) NULL,
    @Column(name = "jenis_profil", nullable = true)
    private String jenisProfil;

//    identitas_profil text NULL,
    @Column(name = "identitas_profil", nullable = true)
    private String identitasProfil;

//    pelanggaran text NULL,
    @Column(name = "pelanggaran", nullable = true)
    private String pelanggaran;

//    nip_rekam varchar(250) NULL,
    @Column(name = "nip_rekam", nullable = true)
    private String nipRekam;

//    waktu_rekam timestamp NULL,
    @Column(name = "waktu_rekam", nullable = true)
    private Date waktuRekam;

//    nip_update varchar(250) NULL,
    @Column(name = "nip_update", nullable = true)
    private String nipUpdate;

//    waktu_update timestamp NULL,
    @Column(name = "waktu_update", nullable = true)
    private Date waktuUpdate;

}
