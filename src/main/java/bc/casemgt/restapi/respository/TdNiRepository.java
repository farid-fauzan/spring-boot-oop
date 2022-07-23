package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdNi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdNiRepository extends JpaRepository<TdNi,String> {

    @Query(value = "SELECT * FROM case_management.td_ni WHERE id_header =:idHeader" , nativeQuery = true)
    TdNi getNiByidheader(@Param("idHeader") String idHeader);
}
