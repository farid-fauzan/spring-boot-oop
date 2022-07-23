package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdInformasi;
import bc.casemgt.restapi.entity.TdLkai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdLkaiRepository extends JpaRepository<TdLkai,String> {
    @Query(value = "SELECT * FROM case_management.td_lkai WHERE id_header =:idHeader" , nativeQuery = true)
    TdLkai getLkaiByidheader(@Param("idHeader") String idHeader);
}
