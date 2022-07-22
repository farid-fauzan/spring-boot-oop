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
@Table(name = "td_sti_petugas", schema = "case_management")
public class TdStiPetugas implements Serializable {

//    id_sti_petugas varchar(250) NOT NULL,
    @Id
    @Column(name = "id_sti_petugas", nullable = false)
    private String idStiPetugas;

//    id_sti varchar(250) NULL,
    @Column(name = "id_sti", nullable = true)
    private String idSti;

//    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;

//    nama varchar(250) NULL,
    @Column(name = "nama", nullable = true)
    private String nama;

//    pangkat_golongan varchar(250) NULL,
    @Column(name = "pangkat_golongan", nullable = true)
    private String pangkatGolongan;

//    jabatan varchar(250) NULL,
    @Column(name = "jabatan", nullable = true)
    private String jabatan;

//    status varchar(250) NULL,
    @Column(name = "status", nullable = true)
    private String status;

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
    private String waktuUpdate;

}
