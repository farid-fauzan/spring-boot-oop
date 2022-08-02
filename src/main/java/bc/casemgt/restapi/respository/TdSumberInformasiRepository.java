package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdSti;
import bc.casemgt.restapi.entity.TdSumberInformasi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdSumberInformasiRepository extends JpaRepository<TdSumberInformasi, String > {

    @Query(value = "SELECT * FROM case_management.td_sumber_informasi WHERE id_header =:idHeader" , nativeQuery = true)
    TdSumberInformasi getSumberInfosByidheader(@Param("idHeader") String idHeader);

    @Query(value = "SELECT * FROM case_management.td_sumber_informasi WHERE id_sumber_informasi =:id" , nativeQuery = true)
    void deleteSumber(@Param("id") String id);
}
