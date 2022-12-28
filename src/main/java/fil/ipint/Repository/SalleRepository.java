package fil.ipint.Repository;

import fil.ipint.Entity.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepository extends CrudRepository< Salle,Long>  {
    
}
