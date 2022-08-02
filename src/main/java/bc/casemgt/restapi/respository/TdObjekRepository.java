package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdNotaProfil;
import bc.casemgt.restapi.entity.TdObjek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdObjekRepository extends JpaRepository<TdObjek, String> {

    @Query(value = "SELECT * FROM case_management.td_objek WHERE id_header =:idHeader" , nativeQuery = true)
    TdObjek getObjekByidheader(@Param("idHeader") String idHeader);

    @Query(value = "DELETE FROM case_management.td_objek WHERE id_objek =:id" , nativeQuery = true)
    void deleteObjek(@Param("id") String id);
}
