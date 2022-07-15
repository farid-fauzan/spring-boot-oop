package bc.casemgt.restapi.respository;


import bc.casemgt.restapi.entity.Informasi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface InformasiRepository extends JpaRepository<Informasi,Long> {
    @Query(value = "SELECT * FROM case_management.informasi WHERE id_header =:idHeader" , nativeQuery = true)
    List<Informasi> getDataByidheader(String idHeader);

}
