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
@Table(name = "td_lkai", schema = "case_management")
public class TdLkai implements Serializable {


    //    CREATE TABLE case_management.td_lkai (
//    id_lkai varchar(250) NOT NULL,
    @Id
    @Column(name = "id_lkai", nullable = false)
    private String idLkai;

//    id_header varchar(250) NULL,

    @Column(name = "id_header", nullable = true)
    private String idHeader;
//    ikhtisar_informasi text NULL,

    @Column(name = "ikhtisar_informasi", nullable = true)
    private String ikhtisarInformasi;

//    prosedur_analisis text NULL,
    @Column(name = "prosedur_analisis", nullable = true)
    private String prosedurAnalisis;
//    hasil_analisis text NULL,

    @Column(name = "hasil_analisis", nullable = true)
    private String hasilAnalisis;
//    kesimpulan text NULL,

    @Column(name = "kesimpulan", nullable = true)
    private String kesimpulan;
//    tujuan varchar(250) NULL,

    @Column(name = "tujuan", nullable = true)
    private String tujuan;
//    nip_rekam varchar(18) NULL,

    @Column(name = "nip_rekam", nullable = true)
    private String nipRekam;
//    waktu_rekam timestamp NULL,

    @Column(name = "waktu_rekam", nullable = true)
    private String waktuRekam;
//    nip_update varchar(18) NULL,

    @Column(name = "nip_update", nullable = true)
    private String nipUpdate;
//    waktu_update timestamp NULL,

    @Column(name = "waktu_update", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuUpdate;
}
