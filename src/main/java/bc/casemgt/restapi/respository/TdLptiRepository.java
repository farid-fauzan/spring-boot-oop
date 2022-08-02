package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdLppi;
import bc.casemgt.restapi.entity.TdLpti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdLptiRepository extends JpaRepository<TdLpti, String> {

    @Query(value = "SELECT * FROM case_management.td_lpti WHERE id_header =:idHeader" , nativeQuery = true)
    TdLpti getLptiByidheader(@Param("idHeader") String idHeader);

    @Query(value = "DELETE FROM case_management.td_lpti WHERE id_lpti =:id" , nativeQuery = true)
    void deleteLpti(@Param("id") String id);
}
