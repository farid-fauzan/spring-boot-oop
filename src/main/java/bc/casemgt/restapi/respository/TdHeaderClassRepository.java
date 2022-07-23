package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.pojo.TdHeaderPojo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class TdHeaderClassRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<TdHeaderPojo> getDataHeader(String idHeader, String nomorDokumen, String nipRekam,
                                            Integer offset)
    {

        StringBuilder qb = new StringBuilder();
        if(idHeader !=null ){
            qb.append(" and idHeader ='"+idHeader+"' \n");
        }
        if(nomorDokumen !=null){
            qb.append("and nomorDokumen ='"+nomorDokumen+"'\n");
        }
        if(nipRekam !=null){
            qb.append("and nipRekam ='"+nipRekam+"'\n");
        }


        String sisipan = qb.toString();

        Query query = entityManager.createQuery(" select  idHeader,\n" +
                "      kodeKategori,\n" +
                "      kodeDokumen,\n" +
                "      nomorDokumen,\n" +
                "      tanggalDokumen,\n" +
                "      kodeKantor,\n" +
                "      namaKantor,\n" +
                "      alamatKantor,\n" +
                "      sifat,\n" +
                "      klasifikasi,\n" +
                "      kodeProses,\n" +
                "      kotaTandaTangan,\n" +
                "      waktuTandaTangan,\n" +
                "      nipPenerbit,\n" +
                "      namaPenerbit,\n" +
                "       jabatanPenerbit,\n" +
                "      pangkatGolonganPenerbit,\n" +
                "      flagPrsetujuan1,\n" +
                "     Long idPersetujuan1,\n" +
                "      flagPersetujuan2,\n" +
                "     Long idPersetujuan2,\n" +
                "      flagTerbit,\n" +
                "      keterangan,\n" +
                "      nipRekam,\n" +
                "      waktuRekam,\n" +
                "      nipUp,\n" +
                "      waktuUp,\n" +
                "      flagAktif\n" +
                " FROM TdHeader a \n" +
                "WHERE 1=1\n"  +
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
            String kodeKategori = String.valueOf(obj[0]);
            String kodeDokumen = String.valueOf(obj[0]);
            String nomorDokumens = String.valueOf(obj[0]);
            String tanggalDokumen = String.valueOf(obj[0]);
            String kodeKantor = String.valueOf(obj[0]);
            String namaKantor = String.valueOf(obj[0]);
            String alamatKantor = String.valueOf(obj[0]);
            String sifat = String.valueOf(obj[0]);
            String klasifikasi = String.valueOf(obj[0]);
            String kodeProses = String.valueOf(obj[0]);
            String kotaTandaTangan = String.valueOf(obj[0]);
            String waktuTandaTangan = String.valueOf(obj[0]);
            String nipPenerbit = String.valueOf(obj[0]);
            String namaPenerbit = String.valueOf(obj[0]);
            String jabatanPenerbit = String.valueOf(obj[0]);
            String pangkatGolonganPenerbit = String.valueOf(obj[0]);
            String flagPrsetujuan1 = String.valueOf(obj[0]);
            Long idPersetujuan1 = Long.valueOf(String.valueOf(obj[0]));
            String flagPersetujuan2 = String.valueOf(obj[0]);
            Long idPersetujuan2 = Long.valueOf(String.valueOf(obj[0]));
            String flagTerbit = String.valueOf(obj[0]);
            String keterangan = String.valueOf(obj[0]);
            String nipRekams = String.valueOf(obj[0]);
            String waktuRekam = String.valueOf(obj[0]);
            String nipUpdate = String.valueOf(obj[0]);
            String waktuUpdate = String.valueOf(obj[0]);
            String flagAktif = String.valueOf(obj[0]);

            //String idHeaders = String.valueOf(obj[0]);
            browse.setIdHeader(idHeaders);
            //            String kodeKategori = String.valueOf(obj[0]);
            browse.setKodeKantor(kodeKantor);
            //            String kodeDokumen = String.valueOf(obj[0]);
            browse.setKodeDokumen(kodeDokumen);
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