package bc.casemgt.restapi.controller;

import bc.casemgt.restapi.services.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/case-management/dashboard")
public class DashboardController {
    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/get-data-header")
    public ResponseEntity browseDataInformasi(String idHeader, String nomorDokumen, String nipRekam,@RequestParam(value = "page", defaultValue = "1") Integer page){

        ResponseEntity responseEntity = dashboardService.getDataHeader(idHeader, nomorDokumen, nipRekam, page);
        return responseEntity;
    }
}
