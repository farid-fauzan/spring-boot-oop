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
@Table(name = "td_sumber_informasi", schema = "case_management")
public class TdSumberInformasi implements Serializable {
    //    id_sumber_informasi varchar(250) NOT NULL,
    @Id
    @Column(name = "id_sumber_informasi", nullable = false)
    private String idSumberInformasi;


//    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;

//    kode_kategori varchar(5) NULL,
    @Column(name = "kode_kategori", nullable = true)
    private String kodeKategori;

//    media varchar(250) NULL,
    @Column(name = "media", nullable = true)
    private String media;

//    tanggal_terima date NULL,
    @Column(name = "tanggal_terima", nullable = true)
    private Date tanggalTerima;

//    nomor_dokumen varchar(250) NULL,
    @Column(name = "nomor_dokumen", nullable = true)
    private String nomorDokumen;

//    tanggal_dokumen date NULL,
    @Column(name = "tanggal_dokumen", nullable = true)
    private Date tanggalDokumen;

    //    nip_rekam varchar(18) NULL,
    @Column(name = "nip_rekam", nullable = true)
    private String niprekam;

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
