package bc.casemgt.restapi.controller;

import bc.casemgt.restapi.respository.TdHeaderRepository;
import bc.casemgt.restapi.services.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("/case-management/delete")
public class DeleteController {
    @Autowired
    private DeleteService deleteService;

    @DeleteMapping("/header")
    public ResponseEntity deleteHeaderByid(@RequestParam String idHeader){

        ResponseEntity responseEntity = deleteService.hapusHeader(idHeader);
        return responseEntity;
    }

    @DeleteMapping("/informasi")
    public ResponseEntity deleteInfo(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusInfo(id);
        return responseEntity;
    }

    @DeleteMapping("/lkai")
    public ResponseEntity deleteLkai(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusLkai(id);
        return responseEntity;
    }

    @DeleteMapping("/lppi")
    public ResponseEntity deleteLppi(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusLppi(id);
        return responseEntity;
    }
    @DeleteMapping("/lpti")
    public ResponseEntity deleteLpti(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusLpti(id);
        return responseEntity;
    }
    @DeleteMapping("/nhi")
    public ResponseEntity deleteNhi(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusNhi(id);
        return responseEntity;
    }
    @DeleteMapping("/ni")
    public ResponseEntity deleteNi(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusNi(id);
        return responseEntity;
    }
    @DeleteMapping("/nota")
    public ResponseEntity deleteNota(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusNota(id);
        return responseEntity;
    }
    @DeleteMapping("/objek")
    public ResponseEntity deleteObjek(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusObjek(id);
        return responseEntity;
    }
    @DeleteMapping("/penerima")
    public ResponseEntity deletePenerima(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusPenerima(id);
        return responseEntity;
    }
    @DeleteMapping("/stipetugas")
    public ResponseEntity deleteStiPetugas(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusStipetugas(id);
        return responseEntity;
    }
    @DeleteMapping("/sumber-informasi")
    public ResponseEntity deleteSumber(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusSumber(id);
        return responseEntity;
    }
    @DeleteMapping("/tembusan")
    public ResponseEntity deleteTembusan(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusTembusan(id);
        return responseEntity;
    }

    @DeleteMapping("/tugas")
    public ResponseEntity deleteTugas(@RequestParam String id){

        ResponseEntity responseEntity = deleteService.hapusTugas(id);
        return responseEntity;
    }
}
