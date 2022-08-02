package bc.casemgt.restapi.services;

import bc.casemgt.restapi.entity.TdInformasi;
import bc.casemgt.restapi.respository.*;
import bc.casemgt.restapi.utility.MessageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DeleteService {
    @Autowired
    private TdHeaderRepository tdHeaderRepository;

    @Autowired
    private TdInformasiRepository tdInformasiRepository;

    @Autowired
    private TdLkaiRepository tdLkaiRepository;

    public ResponseEntity hapusHeader(String idHeader) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            tdHeaderRepository.hapusHeader(idHeader);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", idHeader);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }

    public ResponseEntity hapusInfo(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            tdInformasiRepository.deleteInfo(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }

    public ResponseEntity hapusLkai(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            tdLkaiRepository.deleteLkai(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }
    //deleteLppi
    @Autowired
    private TdLppiRepository tdLppiRepository;
    public ResponseEntity hapusLppi(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            tdLppiRepository.deleteLppi(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }
    //deleteLpti
    @Autowired
    private TdLptiRepository tdLptiRepository;
    public ResponseEntity hapusLpti(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{

            tdLptiRepository.deleteLpti(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }
    //deleteNhi
    @Autowired
    private TdNhiRepository tdNhiRepository;

    public ResponseEntity hapusNhi(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{
            tdNhiRepository.deleteNhi(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }

    @Autowired
    private TdNiRepository tdNiRepository;

    public ResponseEntity hapusNi(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{
            tdNiRepository.deleteNi(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }
    //hapusNota
    @Autowired
    private TdNotaProfilRepository tdNotaProfilRepository;

    public ResponseEntity hapusNota(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{
            tdNotaProfilRepository.deleteNota(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }
    //deleteObjek
    @Autowired
    private TdObjekRepository tdObjekRepository;

    public ResponseEntity hapusObjek(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{
            tdObjekRepository.deleteObjek(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }
    //deletePenerima

    @Autowired
    private TdPenerimaRepository tdPenerimaRepository;

    public ResponseEntity hapusPenerima(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{
            tdPenerimaRepository.deletePenerima(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }
    //deleteStiPetugas
    @Autowired
    private TdStiPetugasRepository tdStiPetugasRepository;

    public ResponseEntity hapusStipetugas(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{
            tdStiPetugasRepository.deleteStiPetugas(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }
    //deleteSti
    @Autowired
    private TdStiRepository tdStiRepository;
    public ResponseEntity hapusSti(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{
            tdStiRepository.deleteSti(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }
    //deleteSumber
    @Autowired
    private TdSumberInformasiRepository tdSumberInformasiRepository;

    public ResponseEntity hapusSumber(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{
            tdSumberInformasiRepository.deleteSumber(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }
    //deleteTembusan
    @Autowired
    private TdTembusanRepository tdTembusanRepository;

    public ResponseEntity hapusTembusan(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{
            tdTembusanRepository.deleteTembusan(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }
    //deleteTugas
    @Autowired
    private TdTugasRepository tdTugasRepository;

    public ResponseEntity hapusTugas(String id) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try{
            tdTugasRepository.deleteTugas(id);
            msg.setStatus(true);
            msg.setMessage("Hapus berhasil");
            result.put("Terhapus id :", id);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }






}
