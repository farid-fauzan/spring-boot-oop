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
@Table(name = "td_objek", schema = "case_management")
public class TdObjek implements Serializable {

//    id_objek varchar(250) NULL,
    @Id
    @Column(name = "id_objek", nullable = true)
    private String idObjek;

//    id_probis varchar(250) NULL,
    @Column(name = "id_probis", nullable = true)
    private String idProbis;

//    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;

//    id_header_referensi varchar(250) NULL,
    @Column(name = "id_header_referensi", nullable = true)
    private String idHeaderReferensi;

//    kode_jenis_objek varchar(5) NULL,
    @Column(name = "kode_jenis_objek", nullable = true)
    private String kodeJenisObjek;

//    kode_jenis_kegiatan varchar(5) NULL,
    @Column(name = "kode_jenis_kegiatan", nullable = true)
    private String kodeJenisKegiatan;

//    kode_dokumen varchar(5) NULL,
    @Column(name = "kode_dokumen", nullable = true)
    private String kodeDokumen;

//    nomor_dokumen varchar(250) NULL,
    @Column(name = "nomor_dokumen", nullable = true)
    private String nomorDokumen;

//    tanggal_dokumen varchar(250) NULL,
    @Column(name = "tanggal_dokumen", nullable = true)
    private String tanggalDokumen;

//    kode_jenis_alat_angkut varchar(5) NULL,
    @Column(name = "kode_jenis_alat_angkut", nullable = true)
    private String kodeJenisAlatAngkut;

//    alat_angkut varchar(250) NULL,
    @Column(name = "alat_angkut", nullable = true)
    private String alatAngkut;

//    voy_flight_pol varchar(250) NULL,
    @Column(name = "voy_flight_pol", nullable = true)
    private String voyFlightPol;

//    no_bl_awb varchar(250) NULL,
    @Column(name = "no_bl_awb", nullable = true)
    private String noBlAwb;

//    kode_jenis_orangle varchar(5) NULL,
    @Column(name = "kode_jenis_orangle", nullable = true)
    private String kodeJenisOrangle;

//    importir_eksportir varchar(250) NULL,
    @Column(name = "importir_eksportir", nullable = true)
    private String importirEksportir;

//    npwp varchar(250) NULL,
    @Column(name = "npwp", nullable = true)
    private String npwp;

//    kode_jenis_tempat varchar(5) NULL,
    @Column(name = "kode_jenis_tempat", nullable = true)
    private String kodeJenisTempat;

//    penyalur varchar(250) NULL,
    @Column(name = "penyalur", nullable = true)
    private String penyalur;

//    tempat_penjualan_eceran varchar(250) NULL,
    @Column(name = "tempat_penjualan_eceran", nullable = true)
    private String tempatPenjualanEceran;

//    nppbkc varchar(250) NULL,
    @Column(name = "nppbkc", nullable = true)
    private String nppbkc;

//    kode_jenis_orang_bt varchar(5) NULL,
    @Column(name = "kode_jenis_orang_bt", nullable = true)
    private String kodeJenisOrangBt;

//    data_lainnya text NULL,
    @Column(name = "data_lainnya", nullable = true)
    private String dataLainnya;

//    nip_rekam varchar(250) NULL,
    @Column(name = "nip_rekam", nullable = true)
    private String nipRekam;

//    waktu_rekam timestamp NULL,
    @Column(name = "waktu_rekam", nullable = true)
    private Date waktuRekam;

//    nip_update varchar(250) NULL,
    @Column(name = "nip_update", nullable = true)
    private Date nipUpdate;

//    waktu_update timestamp NULL
    @Column(name = "waktu_update", nullable = true)
    private Date waktuUpdate;
}
