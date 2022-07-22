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
@Table(name = "td_psa", schema = "case_management")
public class TdPsa implements Serializable {
//    id_psa varchar(250) NOT NULL,
    @Id
    @Column(name = "id_psa", nullable = false)
    private String idPsa;

//    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;

//    kode_jenis_kegiatan varchar(5) NULL,
    @Column(name = "kode_jenis_kegiatan", nullable = true)
    private String kodeJenisKegiatan;

//    pihak_pelanggar varchar(250) NULL,
    @Column(name = "pihak_pelanggar", nullable = true)
    private String pihakPelanggar;

//    kronologis text NULL,
    @Column(name = "kronologis", nullable = true)
    private String kronologis;

//    modus_operandi text NULL,
    @Column(name = "modus_operandi", nullable = true)
    private String modusOperandi;

//    indikator_resiko text NULL,
    @Column(name = "indikator_resiko", nullable = true)
    private String indikatorResiko;

//    pihak_terkait text NULL,
    @Column(name = "pihak_terkait", nullable = true)
    private String pihakTerkait;

//    analisis_peraturan text NULL,
    @Column(name = "analisis_peraturan", nullable = true)
    private String analisisPeraturan;

//    signifikansi_penindakan text NULL,
    @Column(name = "signifikansi_penindakan", nullable = true)
    private String signifikansiPenindakan;

//    proses_penanganan text NULL,
    @Column(name = "proses_penanganan", nullable = true)
    private String prosesPenanganan;

//    kesimpulan text NULL,
    @Column(name = "kesimpulan", nullable = true)
    private String kesimpulan;

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
