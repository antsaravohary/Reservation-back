package fil.ipint.Service.ServiceImplementation;

import fil.ipint.Entity.Concert;
import fil.ipint.Repository.ArtisteRepository;
import fil.ipint.Repository.ConcertRepository;
import fil.ipint.Service.ServiceInterface.ConcertService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.Optional;

@RestController
@Service(value="concertService")
public class ConcertServiceImpl implements ConcertService {

    @Resource
    //private Concert concert ;
    private ConcertRepository concertRepository;


    @Override
    public Concert createConcert(String titre, double prix) {
        Concert concert = new Concert(titre,prix);
        return concertRepository.save(concert);
    }

    @Override
    public Optional<Concert> getConcertById(Long id) {
        return this.concertRepository.findById( id );
    }

    @Override
    public Iterable<Concert> getAllConcert() {
        return concertRepository.findAll();
    }

    @Override
    public void addConcert(Concert concert) {

    }

    @Override
    public Concert updateConcert(Concert concert) {
        return  concertRepository.save(concert);
    }

    @Override
    public void deleteConcert(Concert concert) {
        concertRepository.delete(concert);

    }
    public ConcertRepository getConcertRepository() {
        return concertRepository;
    }
}
