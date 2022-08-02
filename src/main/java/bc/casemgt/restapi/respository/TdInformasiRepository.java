package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdInformasi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdInformasiRepository extends JpaRepository<TdInformasi, String> {

    @Query(value = "SELECT * FROM case_management.td_informasi WHERE id_header =:idHeader" , nativeQuery = true)
    TdInformasi getInformasiByidheader(@Param("idHeader") String idHeader);

    @Query(value = "DELETE FROM case_management.td_informasi WHERE id_ikhtisar_informasi =:id" , nativeQuery = true)
    void deleteInfo(@Param("id") String id);
}
