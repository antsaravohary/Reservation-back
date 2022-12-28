package fil.ipint.Controller;


import fil.ipint.Entity.Concert;
import fil.ipint.Service.ServiceInterface.ConcertService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@RequestMapping(value="/concerts")
public class ConcertController {

    @Resource
    private ConcertService concertService;

    @PostMapping("createConcert")
    public Concert createConcert(@RequestParam(value="titre") String titre,@RequestParam(value="prix") double prix){
        return concertService.createConcert(titre, prix);

    }

    @PostMapping("/{id}")
    public Optional<Concert> getConcertById(@PathVariable(value="id") Long id) {
        return concertService.getConcertById(id);

    }

    @GetMapping
    public Iterable<Concert> getAllConcert(){
        return concertService.getAllConcert();
    }

    @DeleteMapping(value="/{concert}")
    public void deleteConcert(@PathVariable(value="concert") Concert concert) {
        concertService.deleteConcert(concert);

    }

    @PutMapping(value="/{id}")
    public Concert updateConcert(@PathVariable(value="id" )Long id,@RequestBody Concert concert){
        concert.setId(id);
        return concertService.updateConcert(concert);

    }

    @PostMapping
    public void addConcert(@RequestBody Concert concert){
        concertService.deleteConcert(concert);
    }





}
