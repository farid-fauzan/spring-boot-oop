package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdObjek;
import bc.casemgt.restapi.entity.TdPenerima;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdPenerimaRepository extends JpaRepository<TdPenerima, String> {

    @Query(value = "SELECT * FROM case_management.td_penerima WHERE id_header =:idHeader" , nativeQuery = true)
    TdPenerima getPenerimaByidheader(@Param("idHeader") String idHeader);
}
