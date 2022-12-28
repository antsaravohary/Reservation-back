package fil.ipint.Service.ServiceImplementation;

import fil.ipint.Entity.Salle;
import fil.ipint.Repository.SalleRepository;
import fil.ipint.Service.ServiceInterface.SalleService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Service(value= "salleService")
public class SalleServiceImpl implements SalleService {
    private SalleRepository salleRepository;
    @Override
    public Salle createSalle(String name,int nb_place) {

        Salle salle = new Salle(name,nb_place);
        return salleRepository.save(salle);
    }

    @Override
    public Optional<Salle> getSalleById(Long id) {
        return salleRepository.findById(id);
    }

    @Override
    public Iterable<Salle> getAllSalle() {
        return salleRepository.findAll();
    }

    @Override
    public Salle updateSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public void addSalle(Salle salle) {
        salleRepository.save(salle);

    }

    @Override
    public void deleteSalle(Salle salle) {
        salleRepository.delete(salle);

    }

    public SalleRepository getSalleRepository() {
        return salleRepository;
    }
}
