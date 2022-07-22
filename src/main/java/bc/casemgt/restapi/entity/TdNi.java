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
@Table(name = "td_ni", schema = "case_management")
public class TdNi implements Serializable {

//    id_ni varchar(250) NOT NULL,
    @Id
    @Column(name = "id_ni", nullable = false)
    private String idNi;

//    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;

//    id_lkai varchar(250) NULL,
    @Column(name = "id_lkai", nullable = true)
    private String idLkai;

//    nomor_lkai varchar(250) NULL,
    @Column(name = "nomor_lkai", nullable = true)
    private String nomorLkai;

//    tanggal_lkai date NULL,
    @Column(name = "tanggal_lkai", nullable = true)
    private Date tanggalLkai;

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
