package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdNi;
import bc.casemgt.restapi.entity.TdNotaProfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdNotaProfilRepository extends JpaRepository<TdNotaProfil,String> {

    @Query(value = "SELECT * FROM case_management.td_nota_profil WHERE id_header =:idHeader" , nativeQuery = true)
    TdNotaProfil getNotaProfilByidheader(@Param("idHeader") String idHeader);

    @Query(value = "DELETE FROM case_management.td_nota_profil WHERE id_np =:id" , nativeQuery = true)
    void deleteNota(@Param("id") String id);
}
