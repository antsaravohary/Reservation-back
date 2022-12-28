package fil.ipint.Service.ServiceInterface;

import fil.ipint.Entity.Artiste;

public interface ArtisteService {
    Artiste createArtiste(String name);
    Iterable<Artiste> getAllArtiste();
    void addArtiste(Artiste artiste);
    Artiste updateArtiste(Artiste artiste);
    void deleteArtiste(Artiste artiste);
}
