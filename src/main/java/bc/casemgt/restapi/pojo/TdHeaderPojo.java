package bc.casemgt.restapi.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TdHeaderPojo {
    private String idHeader;
    private String kodeKategori;
    private String kodeDokumen;
    private String nomorDokumen;
    private String tanggalDokumen;
    private String kodeKantor;
    private String namaKantor;
    private String alamatKantor;
    private String sifat;
    private String klasifikasi;
    private String kodeProses;
    private String kotaTandaTangan;
    private String waktuTandaTangan;
    private String nipPenerbit;
    private String namaPenerbit;
    private  String jabatanPenerbit;
    private String pangkatGolonganPenerbit;
    private String flagPrsetujuan1;
    private Long idPersetujuan1;
    private String flagPersetujuan2;
    private Long idPersetujuan2;
    private String flagTerbit;
    private String keterangan;
    private String nipRekam;
    private String waktuRekam;
    private String nipUpdate;
    private String waktuUpdate;
    private String flagAktif;

}
