package fil.ipint.Controller;

import fil.ipint.Entity.Artiste;
import fil.ipint.Service.ServiceInterface.ArtisteService;
import fil.ipint.Service.ServiceInterface.ConcertService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="artistes")
public class ArtisteController {

    private ArtisteService artisteService;
    private ConcertService concertService;

    @PostMapping(value="createArtiste")
    public Artiste createArtiste(@RequestParam(value="name")String name){
        return artisteService.createArtiste(name);
    }

    @GetMapping
    public Iterable<Artiste> getllSalle(){return artisteService.getAllArtiste();}

    @DeleteMapping(value="/{deleteartiste}")
    public void deleteAtiste(@PathVariable(value="deleteartiste")Artiste artiste){
        artisteService.deleteArtiste(artiste);
    }

    @PutMapping(value="/{upartiste}")
    public Artiste updateArtiste(@PathVariable(value="{upartiste}")Artiste artiste){
    return artisteService.updateArtiste(artiste);
    }

    @PostMapping
    public void addArtiste(@RequestBody Artiste artiste){
        artisteService.addArtiste(artiste);
    }


    
}
