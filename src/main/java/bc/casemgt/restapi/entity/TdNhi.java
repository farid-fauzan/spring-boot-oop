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
@Table(name = "td_nhi", schema = "case_management")
public class TdNhi implements Serializable {

//    id_nhi varchar(250) NOT NULL,
    @Id
    @Column(name = "id_nhi", nullable = false)
    private String idNhi;

//    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;

//    perintah varchar(250) NULL,
    @Column(name = "perintah", nullable = true)
    private String perintah;

//    objek_penindakan varchar(250) NULL,
    @Column(name = "objek_penindakan", nullable = true)
    private String objekPenindakan;

//    tempat_periksa varchar(250) NULL,
    @Column(name = "tempat_periksa", nullable = true)
    private String tempatPeriksa;

//    waktu_periksa timestamp NULL,
    @Column(name = "waktu_periksa", nullable = true)
    private Date waktuPeriksa;

//    kode_kantor varchar(6) NULL,
    @Column(name = "kode_kantor", nullable = true)
    private String kodeKantor;

//    flag_impor_ekspor varchar(250) NULL,
    @Column(name = "flag_impor_ekspor", nullable = true)
    private String flagImporEkspor;

//    flag_cukai varchar(1) NULL,
    @Column(name = "flag_cukai", nullable = true)
    private String flagCukai;

//    flag_barang_tertentu varchar(1) NULL,
    @Column(name = "flag_barang_tertentu", nullable = true)
    private String flagBarangTertentu;

//    indikasi text NULL,
    @Column(name = "indikasi", nullable = true)
    private String indikasi;

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
