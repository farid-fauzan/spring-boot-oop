package bc.casemgt.restapi.controller;


import bc.casemgt.restapi.entity.*;
import bc.casemgt.restapi.services.RekamDokumenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/case-management/dokumen")
public class RekamDokumenController {
    @Autowired
    private RekamDokumenService rekamDokumenService;

//    Insert into td_informasi

    @PostMapping("/post/informasi")
    private String saveInformasi(@RequestBody TdInformasi informasi)
    {
        rekamDokumenService.saveTdInformasi(informasi);
        return informasi.getInformasi();
    }

    @GetMapping("/get-data-informasi")
    public ResponseEntity browseinformasi(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getInformasi(idheader);
        return responseEntity;
    }
//    Insert into td_lkai

    @PostMapping("/post/lkai")
    private String saveLkai(@RequestBody TdLkai lkai)
    {
        rekamDokumenService.saveTdLkai(lkai);
        return lkai.getIdLkai();
    }

    @GetMapping("/get-data-lkai")
    public ResponseEntity browseLkai(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getLkai(idheader);
        return responseEntity;
    }
//    Insert into td_lppi

    @PostMapping("/post/lppi")
    private String saveLppi(@RequestBody TdLppi lppi)
    {
        rekamDokumenService.saveTdLppi(lppi);
        return lppi.getIdLppi();
    }

    @GetMapping("/get-data-lppi")
    public ResponseEntity browseLppi(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getLppi(idheader);
        return responseEntity;
    }
//    Insert into td_lpti

    @PostMapping("/post/lpti")
    private String savelpti(@RequestBody TdLpti lpti)
    {
        rekamDokumenService.saveTdLpti(lpti);
        return lpti.getIdLpti();
    }

    @GetMapping("/get-data-lpti")
    public ResponseEntity browseLpti(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getLpti(idheader);
        return responseEntity;
    }
//    Insert into td_nhi

    @PostMapping("/post/nhi")
    private String saveNhi(@RequestBody TdNhi nhi)
    {
        rekamDokumenService.saveTdNhi(nhi);
        return nhi.getIdNhi();
    }

    @GetMapping("/get-data-nhi")
    public ResponseEntity browseNhi(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getNhi(idheader);
        return responseEntity;
    }
//    Insert into td_ni

    @PostMapping("/post/ni")
    private String saveNi(@RequestBody TdNi ni)
    {
        rekamDokumenService.saveTdNi(ni);
        return ni.getIdNi();
    }

    @GetMapping("/get-data-ni")
    public ResponseEntity browseNi(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getNi(idheader);
        return responseEntity;
    }
//    Insert into td_nota_profil

    @PostMapping("/post/nota-profil")
    private String saveNotaProfil(@RequestBody TdNotaProfil notaProfil)
    {
        rekamDokumenService.saveTdNotaProfil(notaProfil);
        return notaProfil.getIdNp();
    }

    @GetMapping("/get-data-nota-profil")
    public ResponseEntity browseNotaProfil(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getNotaProfil(idheader);
        return responseEntity;
    }
//    Insert into td_objek

    @PostMapping("/post/objek")
    private String saveObjek(@RequestBody TdObjek objek)
    {
        rekamDokumenService.saveTdObjek(objek);
        return objek.getIdObjek();
    }

    @GetMapping("/get-data-objek")
    public ResponseEntity browseObjek(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getObjek(idheader);
        return responseEntity;
    }
//    Insert into td_penerima

    @PostMapping("/post/penerima")
    private String savePenerima(@RequestBody TdPenerima penerima)
    {
        rekamDokumenService.saveTdPenerima(penerima);
        return penerima.getIdPenerima();
    }

    @GetMapping("/get-data-penerima")
    public ResponseEntity browsePenerima(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getPenerima(idheader);
        return responseEntity;
    }
//    Insert into td_sti

    @PostMapping("/post/sti")
    private String saveSti(@RequestBody TdSti sti)
    {
        rekamDokumenService.saveTdSti(sti);
        return sti.getIdSti();
    }

    @GetMapping("/get-data-sti")
    public ResponseEntity browseSti(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getSti(idheader);
        return responseEntity;
    }
//    Insert into td_sti_petugas

    @PostMapping("/post/sti-petugas")
    private String saveStiPetugas(@RequestBody TdStiPetugas stiPetugas)
    {
        rekamDokumenService.saveTdStiPetugas(stiPetugas);
        return stiPetugas.getIdStiPetugas();
    }

    @GetMapping("/get-data-sti-petugas")
    public ResponseEntity browseStiPetugas(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getStiPetugas(idheader);
        return responseEntity;
    }
//    Insert into td_sumber_informasi

    @PostMapping("/post/sumber-informasi")
    private String saveSumberInformasi(@RequestBody TdSumberInformasi sumberInformasi)
    {
        rekamDokumenService.saveTdSumberinfo(sumberInformasi);
        return sumberInformasi.getIdSumberInformasi();
    }

    @GetMapping("/get-data-sumber-informasi")
    public ResponseEntity browseSumberInfo(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getSumberinfo(idheader);
        return responseEntity;
    }
//    Insert into td_tembusan

    @PostMapping("/post/tembusan")
    private String saveTembusan(@RequestBody TdTembusan tembusan)
    {
        rekamDokumenService.saveTdTembusan(tembusan);
        return tembusan.getIdTembusan();
    }
    @GetMapping("/get-data-tembusan")
    public ResponseEntity browseTembusan(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getTembusan(idheader);
        return responseEntity;
    }
//    Insert into td_tugas

    @PostMapping("/post/tugas")
    private String saveTugas(@RequestBody TdTugas tugas)
    {
        rekamDokumenService.saveTdTugas(tugas);
        return tugas.getIdTugas();
    }

    @GetMapping("/get-data-tugas")
    public ResponseEntity browseTugas(@RequestParam String idheader){

        ResponseEntity responseEntity = rekamDokumenService.getTugas(idheader);
        return responseEntity;
    }

    @PostMapping("/post/header")
    private String saveTdHeader(@RequestBody TdHeader header)
    {
        rekamDokumenService.saveTdHeader(header);
        return header.getIdHeader();
    }
}
