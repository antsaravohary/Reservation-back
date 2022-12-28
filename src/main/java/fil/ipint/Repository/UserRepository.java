package fil.ipint.Repository;

import fil.ipint.Entity.utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<utilisateur,Long> {
    utilisateur findByEmail(String email);
}
