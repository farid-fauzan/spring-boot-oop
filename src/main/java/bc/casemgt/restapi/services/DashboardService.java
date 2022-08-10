package bc.casemgt.restapi.services;

import bc.casemgt.restapi.entity.Informasi;
import bc.casemgt.restapi.pojo.TdHeaderPojo;
import bc.casemgt.restapi.respository.TdHeaderClassRepository;
import bc.casemgt.restapi.utility.MessageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DashboardService {
    @Autowired
    private TdHeaderClassRepository tdHeaderClassRepository;

    public ResponseEntity getDataHeader(String idHeader, String nomorDokumen, String kodeDokumen, String kodeKategori, String nipRekam,Integer page) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        Integer offset = (page -1) * 10;
        try{

            List<TdHeaderPojo> dataRespon = tdHeaderClassRepository.getDataHeader(idHeader, nomorDokumen, kodeDokumen,
                    kodeKategori, nipRekam, offset);

            if(dataRespon.isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Data tidak ditemukan");
                msg.setData(null);
                return ResponseEntity.ok().body(msg);
            }else {
                msg.setStatus(true);
                msg.setMessage("Success");
                result.put("data", dataRespon);
                msg.setData(result);
                return ResponseEntity.ok().body(msg);
            }
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }
}
