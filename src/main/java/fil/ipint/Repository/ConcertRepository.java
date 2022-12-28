package fil.ipint.Repository;

import fil.ipint.Entity.Concert;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ConcertRepository extends CrudRepository<Concert,Long> {

    //Iterable<Concert> findByLastName(String string);
	//Concert findByShortName(String shortName);
	
	
}
