package bc.casemgt.restapi.controller;

import bc.casemgt.restapi.services.InformasiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/case-management")
public class BrowseInformasiController {

    @Autowired
    private InformasiService informasiService;

    @GetMapping("/informasi/get-data-informasi")
    public ResponseEntity browseDataInformasi(@RequestParam String idHeader){

        ResponseEntity responseEntity = informasiService.getDataByid(idHeader);
        return responseEntity;
    }

    @GetMapping("/get/data-dokumen-referensi")
    public ResponseEntity browsetdHeader(@RequestParam String kodeDokumen) {

        ResponseEntity responseEntity = informasiService.getTdHeader(kodeDokumen);
        return responseEntity;
    }

}

