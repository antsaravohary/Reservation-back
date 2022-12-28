package fil.ipint.Service.ServiceInterface;

import fil.ipint.Entity.utilisateur;
import fil.ipint.Exception.UserAlreadyExist;

public interface UserService {

    utilisateur addUser(utilisateur user) throws UserAlreadyExist;
    void deleteUser (utilisateur user);
    utilisateur getUserByEmail(String email);
    Iterable<utilisateur> getAllUser();


}
