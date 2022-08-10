package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdHeader;
import bc.casemgt.restapi.entity.TdLkai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface TdHeaderRepository extends JpaRepository<TdHeader,String> {

    @Query(value = "delete from case_management.td_header where id_header=:idHeader", nativeQuery = true)
    void hapusHeader(@Param("idHeader") String  idHeader);

    @Query(value = "SELECT * FROM case_management.td_header WHERE kode_dokumen =:kodeDokumen" , nativeQuery = true)
    List<TdHeader> getTdHeaderByKodeDokumen(@Param("kodeDokumen") String kodeDokumen);
    
}
