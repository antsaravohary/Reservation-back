package fil.ipint.Service.ServiceInterface;

import fil.ipint.Entity.Billet;
import fil.ipint.Exception.UserNotFound;

import java.util.Optional;

public  interface BilletService {

    Object ReserverBillet(String email) throws UserNotFound;

    void deleteBillet(Long id );
    Iterable<Billet> getAllBillet();
    //void CancelBookBillet(Long id, String email) throws UserNotFound;

    Optional<Billet> getAllBilletOfUser(String email) throws UserNotFound;




}
