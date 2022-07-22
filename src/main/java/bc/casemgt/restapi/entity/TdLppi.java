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
@Table(name = "td_lppi", schema = "case_management")
public class TdLppi implements Serializable {


    //CREATE TABLE case_management.td_lppi (
    //	id_lppi varchar(250) NOT NULL,
    @Id
    @Column(name = "id_lppi", nullable = false)
    private String id_lppi;

    //	id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;
    //	flag_internal varchar(1) NULL,
    @Column(name = "flag_internal", nullable = true)
    private String flagInternal;
    //	flag_eksternal varchar(1) NULL,
    @Column(name = "flag_eksternal", nullable = true)
    private String flagEksternal;
    //	nama_penerima_informasi varchar(250) NULL,
    @Column(name = "nama_penerima_informasi", nullable = true)
    private String namaPenerimaInformasi;
    //	nip_penilai_informasi varchar(18) NULL,
    @Column(name = "nip_penilai_informasi", nullable = true)
    private String nipPenilaiInformasi;
    //	kesimpulan text NULL,
    @Column(name = "kesimpulan", nullable = true)
    private String kesimpulan;
    //	nip_disposisi varchar(18) NULL,
    @Column(name = "nip_disposisi", nullable = true)
    private String niDisposisi;
    //	tanggal_disposisi timestamp NULL,
    @Column(name = "tanggal_disposisi",nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggal_disposisi;
    //	tindak_lanjut varchar(250) NULL,
    @Column(name = "tindak_lanjut", nullable = true)
    private String tindakLanjut;
    //	catatan text NULL,
    @Column(name = "catatan", nullable = true)
    private String catatan;
    //	nip_rekam varchar(18) NULL,
    @Column(name = "nip_rekam", nullable = true)
    private String nipRekam;
    //	waktu_rekam timestamp NULL,
    @Column(name = "waktu_rekam", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuRekam;
    //	nip_update varchar(18) NULL,
    @Column(name = "nip_update", nullable = true)
    private String nipUpdate;
    //	waktu_update timestamp NULL,
    @Column(name = "waktu_update", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuUpdate;
}
