package fil.ipint.Controller;

import fil.ipint.Entity.Billet;
import fil.ipint.Exception.UserNotFound;
import fil.ipint.Service.ServiceImplementation.BilletServiceImpl;
import fil.ipint.Service.ServiceInterface.BilletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class BilletController {


     @Resource
     private BilletService billetService;

     @PostMapping(value ="/email")
     public Billet reserverBilet(@PathVariable(value="email") String email) throws UserNotFound {
          return (Billet) billetService.ReserverBillet(email);

     }

     @GetMapping(value="/AllTickets")
     public Iterable<Billet> getAllBillet(){
          return billetService.getAllBillet();
     }


     @DeleteMapping(value="/{id}")
     public void deleteBilet(@PathVariable(value="id") Long id){
          billetService.deleteBillet(id);
     }

    /** @DeleteMapping(value="/{id}/{email}")
     public void cancelBookBillet(@PathVariable(value="id") Long id,@PathVariable(value="email")String email) throws UserNotFound {
          billetService.CancelBookBillet(id,email);
     }*/



}
