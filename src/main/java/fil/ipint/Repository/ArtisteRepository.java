package fil.ipint.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fil.ipint.Entity.Artiste;


@Repository
public interface ArtisteRepository extends CrudRepository<Artiste,Long>{
    
}
