package fil.ipint.Service.ServiceInterface;

import fil.ipint.Entity.Salle;

import java.util.Optional;

public interface SalleService {
    Salle createSalle(String name,int nb_place);
    Optional<Salle> getSalleById(Long id);
    Iterable<Salle> getAllSalle();
    Salle updateSalle(Salle salle);
    void addSalle(Salle salle);
    void deleteSalle(Salle salle);




}
