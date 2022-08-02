package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdLkai;
import bc.casemgt.restapi.entity.TdLppi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdLppiRepository extends JpaRepository<TdLppi,String> {
    @Query(value = "SELECT * FROM case_management.td_lppi WHERE id_header =:idHeader" , nativeQuery = true)
    TdLppi getLppiByidheader(@Param("idHeader") String idHeader);

    @Query(value = "DELETE FROM case_management.td_lppi WHERE id_lppi =:id" , nativeQuery = true)
    void deleteLppi(@Param("id") String id);
}
