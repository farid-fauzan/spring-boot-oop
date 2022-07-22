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
@Table(name = "td_lpti", schema = "case_management")
public class TdLpti implements Serializable {
//CREATE TABLE case_management.td_lpti (
    //	id_lpti varchar(250) NOT NULL,
    @Id
    @Column(name = "id_lpti", nullable = false)
    private String id_lpti;

    //	id_header varchar(250) NULL,

    @Column(name = "id_header", nullable = true)
    private String idHeader;
    //	id_sti varchar(250) NULL,
    @Column(name = "id_sti", nullable = true)
    private String idSti;
    //	nomor_sti varchar(250) NULL,
    @Column(name = "nomor_sti", nullable = true)
    private String nomorSti;
    //	tanggal_sti date NULL,
    @Column(name = "tanggal_sti", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date tanggalSti;
    //	wilayah_penugasan varchar(250) NULL,
    @Column(name = "wilayah_penugasan", nullable = true)
    private String wilayahPenugasan;
    //	waktu_mulai_penugasan timestamp NULL,
    @Column(name = "waktu_mulai_penugasan", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuMulaiPenugasan;
    //	waktu_selesai_penugasan timestamp NULL,
    @Column(name = "waktu_selesai_penugasan", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuSelesaiPenugasan;
    //	tempat_pengumpulan_informasi text NULL,
    @Column(name = "tempat_pengumpulan_informasi", nullable = true)
    private String tempatPengumpulanInformasi;
    //	sumber_informasi text NULL,
    @Column(name = "sumber_informasi", nullable = true)
    private String sumberInformasi;
    //	metode_pengumpulan_informasi text NULL,
    @Column(name = "metode_pengumpulan_informasi", nullable = true)
    private String metodePengumpulanInformasi;
    //	ikhtisar_informasi text NULL,
    @Column(name = "ikhtisar_informasi", nullable = true)
    private String ikhtisarInformasi;
    //	jenis_dokumen_analisis varchar(250) NULL,
    @Column(name = "jenis_dokumen_analisis", nullable = true)
    private String jenisDokumenAnalisis;
    //	nomor_dokumen_analisis varchar(250) NULL,
    @Column(name = "nomor_dokumen_analisis", nullable = true)
    private String nomorDokumenAnalisis;
    //	tanggal_dokumen_analisis date NULL,
    @Column(name = "tanggal_dokumen_analisis", nullable = true)
    private String tanggalDokumenAnalisis;
    //	metode_analisis_intelijen text NULL,
    @Column(name = "metode_analisis_intelijen", nullable = true)
    private String metodeAnalisisIntelijen;
    //	ikhtisar_hasil_analisis_informasi text NULL,
    @Column(name = "ikhtisar_hasil_analisis_informasi", nullable = true)
    private String ikhtisarHasilAnalisisInformasi;
    //	jenis_pelanggaran varchar(250) NULL,
    @Column(name = "jenis_pelanggaran", nullable = true)
    private String jenisPelanggaran;
    //	modus_pelanggaran text NULL,
    @Column(name = "modus_pelanggaran", nullable = true)
    private String modusPelanggaran;
    //	perkiraan_tempat_pelanggaran varchar(250) NULL,
    @Column(name = "perkiraan_tempat_pelanggaran", nullable = true)
    private String perkiraanTempatPelanggaran;
    //	latitude varchar(250) NULL,
    @Column(name = "latitude", nullable = true)
    private String latitude;
    //	longitude varchar(250) NULL,
    @Column(name = "longitude", nullable = true)
    private String longitude;
    //	latitude_longitude_alamat text NULL,
    @Column(name = "latitude_longitude_alamat", nullable = true)
    private String latitudeLongitudeAlamat;
    //	perkiraan_waktu_pelanggaran timestamp NULL,
    @Column(name = "perkiraan_waktu_pelanggaran", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date perkiraanWaktuPelanggaran;
    //	perkiraan_pelaku_pelanggaran text NULL,
    @Column(name = "perkiraan_pelaku_pelanggaran", nullable = true)
    private String perkiraanPelakuPelanggaran;
    //	informasi_lain text NULL,
    @Column(name = "informasi_lain", nullable = true)
    private String informasiLain;
    //	kesimpulan text NULL,
    @Column(name = "kesimpulan", nullable = true)
    private String kesimpulan;
    //	rekomendasi text NULL,
    @Column(name = "rekomendasi", nullable = true)
    private String rekomendasi;
    //	nip_rekam varchar(18) NULL,
    @Column(name = "nip_rekam", nullable = true)
    private String nipRekam;
    //	waktu_rekam timestamp NULL,
    @Column(name = "waktu_rekam", nullable = true)
    private String waktuRekam;
    //	nip_update varchar(18) NULL,
    @Column(name = "nip_update", nullable = true)
    private String nipUpdate;
    //	waktu_update timestamp NULL,
    @Column(name = "waktu_update", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuUpdate;
}
