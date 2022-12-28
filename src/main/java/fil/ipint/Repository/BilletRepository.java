package fil.ipint.Repository;

import fil.ipint.Entity.Billet;
import fil.ipint.Entity.Concert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BilletRepository  extends CrudRepository<Billet,Long>  {
    //void delete(Optional<Billet> billet);
    //Iterable<Billet> findByUserId(Long idUser);

    //Billet findOne(Long id);
}
