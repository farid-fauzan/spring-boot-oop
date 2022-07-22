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
@Table(name = "td_tembusan", schema = "case_management")
public class TdTembusan implements Serializable {

//    id_tembusan varchar(250) NOT NULL,
    @Id
    @Column(name = "id_tembusan", nullable = false)
    private String idTembusan;

//    id_header varchar(250) NULL,
    @Column(name = "id_header", nullable = true)
    private String idHeader;

//    kode_kategori_instansi varchar(5) NULL,
    @Column(name = "kode_kategori_instansi", nullable = true)
    private String kodeKategoriInstansi;

//    nip varchar(18) NULL,
    @Column(name = "nip", nullable = true)
    private String nip;

//    nama varchar(250) NULL,
    @Column(name = "nama", nullable = true)
    private String nama;

//    jabatan varchar(250) NULL,
    @Column(name = "jabatan", nullable = true)
    private String jabatan;

//    status varchar(250) NULL,
    @Column(name = "status", nullable = true)
    private String status;

//    nip_rekam varchar(250) NULL,
    @Column(name = "nip_rekam", nullable = true)
    private String nipRekam;

//    wakru_rekam timestamp NULL,
    @Column(name = "wakru_rekam", nullable = true)
    private Date wakruRekam;

//    nip_update varchar(250) NULL,
    @Column(name = "nip_update", nullable = true)
    private String nipUpdate;

//    waktu_update timestamp NULL,
    @Column(name = "waktu_update", nullable = true)
    private Date waktuUpdate;


}
