package bc.casemgt.restapi.services;


import bc.casemgt.restapi.entity.*;
import bc.casemgt.restapi.respository.*;
import bc.casemgt.restapi.utility.MessageModel;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RekamDokumenService {
    //Insert into td_informasi
    @Autowired
    private TdInformasiRepository tdInformasiRepository;
    public void saveTdInformasi(TdInformasi informasi)
    {
        tdInformasiRepository.save(informasi);
    }

    public ResponseEntity getInformasi(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdInformasi data = tdInformasiRepository.getInformasiByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    //Insert into td_lkai
    @Autowired
    private TdLkaiRepository tdLkaiRepository;
    public void saveTdLkai(TdLkai lkai)
    {
        tdLkaiRepository.save(lkai);
    }

    public ResponseEntity getLkai(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdLkai data = tdLkaiRepository.getLkaiByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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

    //Insert into td_lppi
    @Autowired
    private TdLppiRepository tdLppiRepository;
    public void saveTdLppi(TdLppi lppi)
    {
        tdLppiRepository.save(lppi);
    }

    public ResponseEntity getLppi(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdLppi data = tdLppiRepository.getLppiByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    //Insert into td_lpti
    @Autowired
    private TdLptiRepository tdLptiRepository;
    public void saveTdLpti(TdLpti lpti)
    {
        tdLptiRepository.save(lpti);
    }

    public ResponseEntity getLpti(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdLpti data = tdLptiRepository.getLptiByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    //Insert into td_nhi
    @Autowired
    private TdNhiRepository tdNhiRepository;
    public void saveTdNhi(TdNhi nhi)
    {
        tdNhiRepository.save(nhi);
    }

    public ResponseEntity getNhi(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdNhi data = tdNhiRepository.getNhiByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    //Insert into td_ni
    @Autowired
    private TdNiRepository tdNiRepository;
    public void saveTdNi(TdNi ni)
    {
        tdNiRepository.save(ni);
    }

    public ResponseEntity getNi(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdNi data = tdNiRepository.getNiByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    //Insert into td_nota_profil
    @Autowired
    private TdNotaProfilRepository tdNotaProfilRepository;
    public void saveTdNotaProfil(TdNotaProfil notaProfil)
    {
        tdNotaProfilRepository.save(notaProfil);
    }

    public ResponseEntity getNotaProfil(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdNotaProfil data = tdNotaProfilRepository.getNotaProfilByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    //Insert into td_objek
    @Autowired
    private TdObjekRepository tdObjekRepository;
    public void saveTdObjek(TdObjek objek)
    {
        tdObjekRepository.save(objek);
    }

    public ResponseEntity getObjek(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdObjek data = tdObjekRepository.getObjekByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    //Insert into td_penerima
    @Autowired
    private TdPenerimaRepository tdPenerimaRepository;
    public void saveTdPenerima(TdPenerima penerima)
    {
        tdPenerimaRepository.save(penerima);
    }

    public ResponseEntity getPenerima(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdPenerima data = tdPenerimaRepository.getPenerimaByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    //Insert into td_sti
    @Autowired
    private TdStiRepository tdStiRepository;
    public void saveTdSti(TdSti sti)
    {
        tdStiRepository.save(sti);
    }

    public ResponseEntity getSti(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdSti data = tdStiRepository.getStiByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    //Insert into td_sti_petugas
    @Autowired
    private TdStiPetugasRepository tdStiPetugasRepository;
    public void saveTdStiPetugas(TdStiPetugas stiPetugas)
    {
        tdStiPetugasRepository.save(stiPetugas);
    }

    public ResponseEntity getStiPetugas(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdStiPetugas data = tdStiPetugasRepository.getStiPetugasByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    //Insert into td_sumber_informasi
    @Autowired
    private TdSumberInformasiRepository tdSumberInformasiRepository;
    public void saveTdSumberinfo(TdSumberInformasi sumberInformasi)
    {
        tdSumberInformasiRepository.save(sumberInformasi);
    }

    public ResponseEntity getSumberinfo(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdSumberInformasi data = tdSumberInformasiRepository.getSumberInfosByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    //Insert into td_tembusan
    @Autowired
    private TdTembusanRepository tdTembusanRepository;
    public void saveTdTembusan(TdTembusan tembusan)
    {
        tdTembusanRepository.save(tembusan);
    }

    public ResponseEntity getTembusan(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdTembusan data = tdTembusanRepository.getTembusanByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    //Insert into td_tugas
    @Autowired
    private TdTugasRepository tdTugasRepository;
    public void saveTdTugas(TdTugas tugas)
    {
        tdTugasRepository.save(tugas);
    }

    public ResponseEntity getTugas(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            TdTugas data = tdTugasRepository.getTugasByidheader(idHeader);

            if(data.getIdHeader().isEmpty()){
                msg.setStatus(true);
                msg.setMessage("Date tidak ditemukan");
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
    @Autowired
    private TdHeaderRepository tdHeaderRepository;
    public void saveTdHeader(TdHeader header)
    {
        tdHeaderRepository.save(header);
    }


}
