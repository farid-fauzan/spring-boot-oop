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
@Table(name = "td_rekomendasi", schema = "case_management")
public class TdRekomendasi implements Serializable {

//    id_rekomendasi varchar(250) NULL,
    @Id
    @Column(name = "id_rekomendasi", nullable = true)
    private String idRekomendasi;

//    id_probis varchar(250) NULL,
    @Column(name = "id_probis", nullable = true)
    private String idProbis;

//    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String id_header;

//    kode_rekomendasi varchar(5) NULL,
    @Column(name = "kode_rekomendasi", nullable = true)
    private String kodeRekomendasi;

//    uraian text NULL,
    @Column(name = "uraian", nullable = true)
    private String uraian;

//    nip_rekam varchar(250) NULL,
    @Column(name = "nip_rekam", nullable = true)
    private String nipRekam;

//    waktu_rekam timestamp NULL,
    @Column(name = "waktu_rekam", nullable = true)
    private Date waktuRekam;

//    nip_update varchar(250) NULL,
    @Column(name = "nip_update", nullable = true)
    private String nipUpdate;

//    waktu_update timestamp NULL
    @Column(name = "waktu_update", nullable = true)
    private Date waktuUpdate;
}
