package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdSti;
import bc.casemgt.restapi.entity.TdStiPetugas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdStiRepository extends JpaRepository<TdSti, String> {

    @Query(value = "SELECT * FROM case_management.td_sti WHERE id_header =:idHeader" , nativeQuery = true)
    TdSti getStiByidheader(@Param("idHeader") String idHeader);
}
