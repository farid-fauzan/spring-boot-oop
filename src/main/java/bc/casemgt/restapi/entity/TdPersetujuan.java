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
@Table(name = "td_persetujuan", schema = "case_management")
public class TdPersetujuan implements Serializable {

//    id_persetujuan varchar(250) NOT NULL,
    @Id
    @Column(name = "id_persetujuan", nullable = false)
    private String idPersetujuan;

//    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;

//    jenis_persetujuan varchar(250) NULL,
    @Column(name = "jenis_persetujuan", nullable = true)
    private String jenisPersetujuan;

//    tipe varchar(250) NULL,
    @Column(name = "tipe", nullable = true)
    private String tipe;

//    nip varchar(18) NULL,
    @Column(name = "nip", nullable = true)
    private String nip;

//    nama varchar(250) NULL,
    @Column(name = "nama", nullable = true)
    private String nama;

//    jabatan varchar(250) NULL,
    @Column(name = "jabatan", nullable = true)
    private String jabatan;

//    pangkat_golongan varchar(250) NULL,
    @Column(name = "pangkat_golongan", nullable = true)
    private String pangkatGolongan;

//    persetujuan timestamp NULL,
    @Column(name = "persetujuan", nullable = true)
    private Date persetujuan;

//    keputusan text NULL,
    @Column(name = "keputusan", nullable = true)
    private String keputusan;

//    catatan text NULL,
    @Column(name = "catatan", nullable = true)
    private String catatan;

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
    private String nipUpdate;

//    waktu_update timestamp NULL,
    @Column(name = "waktu_update", nullable = true)
    private Date waktuUpdate;
}
