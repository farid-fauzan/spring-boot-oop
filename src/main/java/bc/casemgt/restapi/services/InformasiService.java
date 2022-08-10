package bc.casemgt.restapi.services;


import bc.casemgt.restapi.entity.Informasi;
import bc.casemgt.restapi.entity.TdHeader;
import bc.casemgt.restapi.respository.InformasiRepository;
import bc.casemgt.restapi.respository.TdHeaderRepository;
import bc.casemgt.restapi.utility.MessageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InformasiService {
    @Autowired
    private InformasiRepository informasiRepository;
    @Autowired
    private TdHeaderRepository tdHeaderRepository;



    public ResponseEntity getDataByid(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            List<Informasi> dataRespon = informasiRepository.getDataByidheader(idHeader);

            if(dataRespon.isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Nomor Aju tidak ditemukan");
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

    public ResponseEntity getTdHeader(String kodeDokumen) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            List<TdHeader> data = tdHeaderRepository.getTdHeaderByKodeDokumen(kodeDokumen);

            if(data.isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Data tidak ditemukan");
                msg.setData(null);
                return ResponseEntity.ok().body(msg);
            }else {
                msg.setStatus(true);
                msg.setMessage("Success");
                result.put("data", data);
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
