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
@Table(name = "td_header", schema = "case_management")
public class TdHeader implements Serializable {


    //    CREATE TABLE case_management.td_header (
//    id_header varchar(250) NOT NULL,
    @Id
    @Column(name = "id_header", length = 250,nullable = false)
    private String idHeader;

//    kode_kategori varchar(5) NULL,

    @Column(name = "kode_kategori", nullable = true)
    private String kodeKategori;
//    kode_dokumen varchar(5) NULL,

    @Column(name = "kode_dokumen", length = 250, nullable = true)
    private String kodeDokumen;
//    nomor_dokumen varchar(250) NULL,

    @Column(name = "nomor_dokumen",length = 250,nullable = true)
    private String nomorDokumen;
//    tanggal_dokumen date NULL,

    @Column(name = "tanggal_dokumen", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date tanggalDokumen;
//    kode_kantor varchar(6) NULL,

    @Column(name = "kode_kantor",length = 250, nullable = true)
    private String kodeKantor;
//    nama_kantor varchar(250) NULL,

    @Column(name = "nama_kantor", length = 250,nullable = true)
    private String namaKantor;
//    alamat_kantor varchar(250) NULL,

    @Column(name ="alamat_kantor", length = 250, nullable = true)
    private String alamatKantor;
//    sifat varchar(250) NULL,
    @Column(name = "sifat", length = 250, nullable = true)
    private String sifat;
//    klasifikasi varchar(250) NULL,
    @Column(name = "klasifikasi", nullable = true)
    private String klasifikasi;
//    kode_proses varchar(5) NULL,
    @Column(name = "kode_proses", nullable = true)
    private String kodeProses;

//    kota_tanda_tangan varchar(250) NULL,
    @Column(name = "kota_tanda_tangan", nullable = true)
    private String kotaTandaTangan;
//    waktu_tanda_tangan timestamp NULL,
    @Column(name = "waktu_tanda_tangan", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuTandaTangan;
//    nip_penerbit varchar(18) NULL,
    @Column(name = "nip_penerbit", nullable = true )
    private String nipPenerbit;
//    nama_penerbit varchar(250) NULL,
    @Column(name = "nama_penerbit", nullable = true)
    private String namaPenerbit;
//    jabatan_penerbit varchar(250) NULL,
    @Column(name = "jabatan_penerbit", nullable = true)
    private  String jabatanPenerbit;
//    pangkat_golongan_penerbit varchar(250) NULL,
    @Column(name = "pangkat_golongan_penerbit", nullable = true)
    private String pangkatGolonganPenerbit;
//    flag_persetujuan1 varchar(1) NULL,

    @Column(name = "flag_persetujuan1", nullable = true)
    private String flagPrsetujuan1;
//    id_persetujuan1 int4 NULL,
    @Column(name ="id_persetujuan1", nullable = true )
    private Long idPersetujuan1;
//    flag_persetujuan2 varchar(1) NULL,
    @Column(name = "flag_persetujuan2", nullable = true)
    private String flagPersetujuan2;
//    id_persetujuan2 int4 NULL,
    @Column(name = "id_persetujuan2", nullable = true)
    private Long idPersetujuan2;
//    flag_terbit varchar(1) NULL,

    @Column(name = "flag_terbit", nullable = true)
    private String flagTerbit;
//    keterangan text NULL,

    @Column(name = "keterangan", nullable = true)
    private String keterangan;
//    nip_rekam varchar(18) NULL,

    @Column(name = "nip_rekam", nullable = true)
    private String nipRekam;
//    waktu_rekam timestamp NULL,

    @Column(name = "waktu_rekam", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuRekam;
//    nip_update varchar(18) NULL,

    @Column(name = "nip_update", nullable = true)
    private String nipUpdate;
//    waktu_update timestamp NULL,

    @Column(name = "waktu_update", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuUpdate;
//    flag_aktif varchar(1) NULL,

    @Column(name = "flag_aktif", nullable = true)
    private String flagAktif;
}
