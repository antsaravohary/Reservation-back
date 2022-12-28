package fil.ipint.Service.ServiceInterface;

import fil.ipint.Entity.Concert;

import java.util.Optional;

public interface ConcertService {

    Concert createConcert(String titre,double prix);
    Optional<Concert> getConcertById(Long id);
    Iterable<Concert> getAllConcert();
    void addConcert(Concert concert);
    Concert updateConcert(Concert concert);
    void deleteConcert(Concert concert);


}
