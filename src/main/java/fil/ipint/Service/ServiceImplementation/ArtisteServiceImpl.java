package fil.ipint.Service.ServiceImplementation;

import fil.ipint.Entity.Artiste;
import fil.ipint.Repository.ArtisteRepository;
import fil.ipint.Service.ServiceInterface.ArtisteService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service(value="artisteService")
public class ArtisteServiceImpl implements ArtisteService{

    private ArtisteRepository artisteRepository ;
    @Override
    public Artiste createArtiste(String name) {
        Artiste artiste = new Artiste(name);
        return artisteRepository.save(artiste);
    }

    @Override
    public Iterable<Artiste> getAllArtiste() {
        return artisteRepository.findAll();
    }

    @Override
    public void addArtiste(Artiste artiste) {
        artisteRepository.save(artiste);


    }

    @Override
    public Artiste updateArtiste(Artiste artiste) {
        return artisteRepository.save(artiste);
    }

    @Override
    public void deleteArtiste(Artiste artiste) {
        artisteRepository.delete(artiste);

    }
    public ArtisteRepository getArtisteRepository() {
        return artisteRepository;
    }
}
