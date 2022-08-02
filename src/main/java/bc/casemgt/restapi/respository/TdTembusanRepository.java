package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdSumberInformasi;
import bc.casemgt.restapi.entity.TdTembusan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdTembusanRepository extends JpaRepository<TdTembusan, String> {

    @Query(value = "SELECT * FROM case_management.td_tembusan WHERE id_header =:idHeader" , nativeQuery = true)
    TdTembusan getTembusanByidheader(@Param("idHeader") String idHeader);

    @Query(value = "SELECT * FROM case_management.td_tembusan WHERE id_tembusan =:id" , nativeQuery = true)
    void deleteTembusan(@Param("id") String id);
}
