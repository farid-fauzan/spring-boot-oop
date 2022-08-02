package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdTembusan;
import bc.casemgt.restapi.entity.TdTugas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdTugasRepository extends JpaRepository<TdTugas, String> {
    @Query(value = "SELECT * FROM case_management.td_tugas WHERE id_header =:idHeader" , nativeQuery = true)
    TdTugas getTugasByidheader(@Param("idHeader") String idHeader);

    @Query(value = "SELECT * FROM case_management.td_tugas WHERE id_tugas =:id" , nativeQuery = true)
    void deleteTugas(@Param("id") String id);
}
