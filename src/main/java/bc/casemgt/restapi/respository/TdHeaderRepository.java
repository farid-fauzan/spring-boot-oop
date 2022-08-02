package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface TdHeaderRepository extends JpaRepository<TdHeader,String> {

    @Query(value = "delete from case_management.td_header where id_header=:idHeader", nativeQuery = true)
    void hapusHeader(@Param("idHeader") String  idHeader);
    
}
