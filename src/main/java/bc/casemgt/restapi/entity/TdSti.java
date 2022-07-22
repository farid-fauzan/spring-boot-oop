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
@Table(name = "td_sti", schema = "case_management")
public class TdSti implements Serializable {

//    id_sti varchar(250) NOT NULL,
    @Id
    @Column(name = "id_sti", nullable = false)
    private String idSti;

//    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;

//    wilayah_penugasan varchar(250) NULL,
    @Column(name = "wilayah_penugasan", nullable = true)
    private String wilayahPenugasan;

//    waktu_mulai_penugasan timestamp NULL,
    @Column(name = "waktu_mulai_penugasan", nullable = true)
    private Date waktuPenugasan;

//    waktu_selesai_penugasan timestamp NULL,
    @Column(name = "waktu_selesai_penugasan", nullable = true)
    private Date waktuSelesaiPenugasan;

//    sifat_kegiatan varchar(250) NULL,
    @Column(name = "sifat_kegiatan", nullable = true)
    private String sifatKegiatan;

//    pakaian varchar(250) NULL,
    @Column(name = "pakaian", nullable = true)
    private String pakaian;

//    kantor_unit_dipa varchar(6) NULL,
    @Column(name = "kantor_unit_dipa", nullable = true)
    private String kantorUnitDipa;

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
