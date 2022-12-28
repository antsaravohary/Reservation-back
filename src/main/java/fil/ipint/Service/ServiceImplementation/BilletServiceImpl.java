package fil.ipint.Service.ServiceImplementation;

import fil.ipint.Entity.Billet;
import fil.ipint.Entity.Concert;
import fil.ipint.Entity.Salle;
import fil.ipint.Entity.utilisateur;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import fil.ipint.Exception.UserNotFound;
import fil.ipint.Repository.BilletRepository;
import fil.ipint.Repository.UserRepository;
import fil.ipint.Service.ServiceInterface.BilletService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Service("BilletService")
public class BilletServiceImpl implements BilletService {

    private BilletRepository billetRepository;
    private UserRepository userRepository;

    @Override
    public Billet ReserverBillet(String email) throws UserNotFound {
        utilisateur user = userRepository.findByEmail(email);
        if(user == null){
            throw new UserNotFound();
        }

        Billet billet = new  Billet();
        Concert concert =new Concert("charles aznavour",45.99);
        billet.setConcert(concert);
        billet.setDateAchat(new Date());
        billet.setId(3456);
        Salle salle= new Salle("salle03",50);
        billet.setSalle(salle);

        return (Billet) billetRepository.save(billet);


    }

    @Override
    public void deleteBillet(Long id) {
        billetRepository.deleteById(id);

    }

    @Override
    public Iterable<Billet> getAllBillet() {
        return billetRepository.findAll();
    }

    /**@Override
    public void CancelBookBillet(Long id, String email) throws UserNotFound {

         Optional<Billet> billet = billetRepository.findById(id);
         utilisateur user = userRepository.findByEmail(email);
         if(user==null){
             throw new UserNotFound();
         }
         if(!billet.getUser().getIdUser().equals(user.getIdUser())) {
             throw new RuntimeException("vous pouvez supprimer le billet car vous etes pas le proprietaire");

         }
         billetRepository.delete(billet);



    }*/

    @Override
    public Optional<Billet> getAllBilletOfUser(String email) throws UserNotFound {
        utilisateur user = userRepository.findByEmail(email);
        if (user== null){
            throw new UserNotFound();

        }
        return billetRepository.findById(user.getIdUser());
    }
}
