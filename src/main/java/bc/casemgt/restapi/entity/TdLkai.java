package bc.casemgt.restapi.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

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
//    hasil_analisis text NULL,
//    kesimpulan text NULL,
//    tujuan varchar(250) NULL,
//    nip_rekam varchar(18) NULL,
//    waktu_rekam timestamp NULL,
//    nip_update varchar(18) NULL,
//    waktu_update timestamp NULL,
}
