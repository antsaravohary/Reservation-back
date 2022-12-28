package fil.ipint.Controller;

import fil.ipint.Entity.Concert;
import fil.ipint.Entity.Salle;
import fil.ipint.Service.ServiceInterface.SalleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value="/salles")
public class SalleController {


    private SalleService salleService;

    @PostMapping(value="createsalle")
    public Salle createSalle(@RequestParam("name") String name,@RequestParam(value="nb_place")int nb_place){
        return salleService.createSalle(name,nb_place);
    }
    @PostMapping("/{id}")
    public Optional<Salle> getSalleById(@PathVariable(value="id") Long id) {
        return salleService.getSalleById(id);

    }

    @GetMapping
    public Iterable<Salle> getAllSalle(){
        return salleService.getAllSalle();
    }

    @DeleteMapping(value="/{salle}")
    public void deleteSalle(@PathVariable(value="salle") Salle salle) {
        salleService.deleteSalle(salle);

    }

    @PutMapping(value="/{id}")
    public Salle updateSalle(@PathVariable(value="id" )Long id,@RequestBody Salle salle){
        salle.setId(id);
        return salleService.updateSalle(salle);

    }

    @PostMapping
    public void addSalle(@RequestBody Salle salle){
        salleService.deleteSalle(salle);
    }


}
