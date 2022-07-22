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
@Table(name = "td_dokumen", schema = "case_management")
public class TdDokumen implements Serializable {


    //    CREATE TABLE case_management.td_dokumen (
//    id_dokumen varchar(250) NULL,
    @Id
    @Column(name = "id_dokumen", nullable = false)
    private String idDokumen;
//    id_probis varchar(250) NULL,
    @Column(name = "id_probis", nullable = true)
    private String idProbis;

    @Column(name = "id_header", nullable = true)
    private String idHeader;

    @Column(name = "kategori", nullable = true)
    private String kategori;

//    id_header varchar(250) NULL,
//    kategori varchar(250) NULL,
    @Column(name = "jenis_dokumen", nullable = true)
    private String jenisSokumen;
//    jenis_dokumen varchar(250) NULL,
    @Column(name = "nama_dokumen", nullable = true)
    private String namaNokumen;
//    nama_dokumen varchar(250) NULL,
    @Column(name = "tanggal_dokumen", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date tanggalDokumen;
//    tanggal_dokumen date NULL,
    @Column(name = "format_data", nullable = true)
    private String formatData;
//    format_data text NULL,
    @Column(name = "data_dokumen", nullable = true)
    private String dataDokumen;
//    data_dokumen text NULL,
//    url text NULL,
    @Column(name = "url", nullable = true)
    private String url;
//    keterangan text NULL,
    @Column(name = "keterangan", nullable = true)
    private String keterangan;
//    nip_rekam varchar(250) NULL,
    @Column(name = "nip_rekam", nullable = true)
    private String nipRekam;
//    waktu_rekam timestamp NULL,
    @Column(name = "waktu_rekam", nullable = true)
    private String waktuRekam;
//    nip_update varchar(250) NULL,
    @Column(name = "nip_update", nullable = true)
    private String nipUpdate;
//    waktu_update timestamp NULL
    @Column(name = "waktu_update", nullable = true)
    private String waktuUpdate;

}
