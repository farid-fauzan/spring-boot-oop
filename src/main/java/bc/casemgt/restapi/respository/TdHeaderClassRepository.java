package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.pojo.TdHeaderPojo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class TdHeaderClassRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<TdHeaderPojo> getDataHeader(String idHeader, String nomorDokumen, String kodeDokumen, String kodeKategori, String nipRekam,
                                            Integer offset)
    {

        StringBuilder qb = new StringBuilder();
        if(idHeader !=null ){
            qb.append(" and id_header ='"+idHeader+"' \n");
        }
        if(nomorDokumen !=null){
            qb.append("and nomor_dokumen ='"+nomorDokumen+"'\n");
        }
        if(nipRekam !=null){
            qb.append("and nip_rekam ='"+nipRekam+"'\n");
        }
        if(kodeDokumen !=null){
            qb.append("and kode_dokumen ='"+kodeDokumen+"'\n");
        }
        if(kodeKategori !=null){
            qb.append("and kode_kategori ='"+kodeKategori+"'\n");
        }


        String sisipan = qb.toString();

        Query query = entityManager.createNativeQuery(" SELECT id_header, kode_kategori, kode_dokumen, nomor_dokumen, tanggal_dokumen, kode_kantor, nama_kantor, alamat_kantor, sifat, klasifikasi, kode_proses, kota_tanda_tangan, waktu_tanda_tangan, nip_penerbit, nama_penerbit, jabatan_penerbit, pangkat_golongan_penerbit, flag_persetujuan1, id_persetujuan1, flag_persetujuan2, id_persetujuan2, flag_terbit, keterangan, nip_rekam, waktu_rekam, nip_update, waktu_update, flag_aktif\n" +
                "FROM case_management.td_header \n" +
                "WHERE 1=1 \n"  +
                sisipan
        ).setFirstResult(offset).setMaxResults(10);
        //.setFirstResult(20) // equivalent to OFFSET
        //.setMaxResults(5) // equivalent to LIMIT
        //.getResultList();
        //List<Object> test = query.getResultList();
        List hasil= query.getResultList();
        List<TdHeaderPojo> result = new ArrayList<>();

        Iterator itr = hasil.iterator();
        while(itr.hasNext()){
            TdHeaderPojo browse = new TdHeaderPojo();
            Object[] obj = (Object[]) itr.next();

            String idHeaders = String.valueOf(obj[0]);
            String kodeKategoris = String.valueOf(obj[1]);
            String kodeDokumens = String.valueOf(obj[2]);
            String nomorDokumens = String.valueOf(obj[3]);
            String tanggalDokumen = String.valueOf(obj[4]);
            String kodeKantor = String.valueOf(obj[5]);
            String namaKantor = String.valueOf(obj[6]);
            String alamatKantor = String.valueOf(obj[7]);
            String sifat = String.valueOf(obj[8]);
            String klasifikasi = String.valueOf(obj[9]);
            String kodeProses = String.valueOf(obj[10]);
            String kotaTandaTangan = String.valueOf(obj[11]);
            String waktuTandaTangan = String.valueOf(obj[12]);
            String nipPenerbit = String.valueOf(obj[13]);
            String namaPenerbit = String.valueOf(obj[14]);
            String jabatanPenerbit = String.valueOf(obj[15]);
            String pangkatGolonganPenerbit = String.valueOf(obj[16]);
            String flagPrsetujuan1 = String.valueOf(obj[17]);
            Long idPersetujuan1 = Long.valueOf(String.valueOf(obj[18]));
            String flagPersetujuan2 = String.valueOf(obj[19]);
            Long idPersetujuan2 = Long.valueOf(String.valueOf(obj[20]));
            String flagTerbit = String.valueOf(obj[21]);
            String keterangan = String.valueOf(obj[22]);
            String nipRekams = String.valueOf(obj[23]);
            String waktuRekam = String.valueOf(obj[24]);
            String nipUpdate = String.valueOf(obj[25]);
            String waktuUpdate = String.valueOf(obj[26]);
            String flagAktif = String.valueOf(obj[27]);

            //String idHeaders = String.valueOf(obj[0]);
            browse.setIdHeader(idHeaders);
            //            String kodeKategori = String.valueOf(obj[0]);
            browse.setKodeKategori(kodeKategoris);
            //            String kodeKantor = String.valueOf(obj[0]);
            browse.setKodeKantor(kodeKantor);
            //            String kodeDokumen = String.valueOf(obj[0]);
            browse.setKodeDokumen(kodeDokumens);
            //            String nomorDokumens = String.valueOf(obj[0]);
            browse.setNomorDokumen(nomorDokumens);
            //            String tanggalDokumen = String.valueOf(obj[0]);
            browse.setTanggalDokumen(tanggalDokumen);
            //            String kodeKantor = String.valueOf(obj[0]);
            browse.setKodeKantor(kodeKantor);
            //            String namaKantor = String.valueOf(obj[0]);
            browse.setNamaKantor(namaKantor);
            //            String alamatKantor = String.valueOf(obj[0]);
            browse.setAlamatKantor(alamatKantor);
            //            String sifat = String.valueOf(obj[0]);
            browse.setSifat(sifat);
            //            String klasifikasi = String.valueOf(obj[0]);
            browse.setKlasifikasi(klasifikasi);
            //            String kodeProses = String.valueOf(obj[0]);
            browse.setKodeProses(kodeProses);
            //            String kotaTandaTangan = String.valueOf(obj[0]);
            browse.setKotaTandaTangan(kotaTandaTangan);
            //            String waktuTandaTangan = String.valueOf(obj[0]);
            browse.setWaktuTandaTangan(waktuTandaTangan);
            //            String nipPenerbit = String.valueOf(obj[0]);
            browse.setNipPenerbit(nipPenerbit);
            //            String namaPenerbit = String.valueOf(obj[0]);
            browse.setNamaPenerbit(namaPenerbit);
            //            String jabatanPenerbit = String.valueOf(obj[0]);
            browse.setJabatanPenerbit(jabatanPenerbit);
            //            String pangkatGolonganPenerbit = String.valueOf(obj[0]);
            browse.setPangkatGolonganPenerbit(pangkatGolonganPenerbit);
            //            String flagPrsetujuan1 = String.valueOf(obj[0]);
            browse.setFlagPrsetujuan1(flagPrsetujuan1);
            //            Long idPersetujuan1 = Long.valueOf(String.valueOf(obj[0]));
            browse.setIdPersetujuan1(idPersetujuan1);
            //            String flagPersetujuan2 = String.valueOf(obj[0]);
            browse.setFlagPersetujuan2(flagPersetujuan2);
            //            Long idPersetujuan2 = Long.valueOf(String.valueOf(obj[0]);
            browse.setIdPersetujuan2(idPersetujuan2);
            //            String flagTerbit = String.valueOf(obj[0]);
            browse.setFlagTerbit(flagTerbit);
            //            String keterangan = String.valueOf(obj[0]);
            browse.setKeterangan(keterangan);
            //            String nipRekams = String.valueOf(obj[0]);
            browse.setNipRekam(nipRekams);
            //            String waktuRekam = String.valueOf(obj[0]);
            browse.setWaktuRekam(waktuRekam);
            //            String nipUpdate = String.valueOf(obj[0]);
            browse.setNipUpdate(nipUpdate);
            //            String waktuUpdate = String.valueOf(obj[0]);
            browse.setWaktuUpdate(waktuUpdate);
            //            String flagAktif = String.valueOf(obj[0]);
            browse.setFlagAktif(flagAktif);

            result.add(browse);
        }
        return result;

    }
}