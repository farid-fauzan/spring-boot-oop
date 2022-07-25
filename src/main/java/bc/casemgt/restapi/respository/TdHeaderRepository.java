package bc.casemgt.restapi.respository;

import bc.casemgt.restapi.entity.TdHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TdHeaderRepository extends JpaRepository<TdHeader,String> {
    
}
