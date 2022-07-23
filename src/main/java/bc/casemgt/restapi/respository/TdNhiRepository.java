package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdLpti;
import bc.casemgt.restapi.entity.TdNhi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdNhiRepository extends JpaRepository<TdNhi, String> {

    @Query(value = "SELECT * FROM case_management.td_nhi WHERE id_header =:idHeader" , nativeQuery = true)
    TdNhi getNhiByidheader(@Param("idHeader") String idHeader);
}
