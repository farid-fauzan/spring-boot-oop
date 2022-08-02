package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdPenerima;
import bc.casemgt.restapi.entity.TdStiPetugas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TdStiPetugasRepository extends JpaRepository<TdStiPetugas, String> {

    @Query(value = "SELECT * FROM case_management.td_sti_petugas WHERE id_header =:idHeader" , nativeQuery = true)
    TdStiPetugas getStiPetugasByidheader(@Param("idHeader") String idHeader);

    @Query(value = "DELETE FROM case_management.td_sti_petugas WHERE id_sti_petugas =:id" , nativeQuery = true)
    void deleteStiPetugas(@Param("id") String id);
}
