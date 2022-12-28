package fil.ipint.Service.ServiceImplementation;


import fil.ipint.Entity.utilisateur;
import fil.ipint.Exception.UserAlreadyExist;
import fil.ipint.Repository.UserRepository;
import fil.ipint.Service.ServiceInterface.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Service("/userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public utilisateur addUser(utilisateur user) throws UserAlreadyExist {
        utilisateur us = userRepository.findByEmail(user.getEmail());
        if(us !=null){
            throw new UserAlreadyExist();
        }
        utilisateur usr = new utilisateur();
        usr.setAdresse("rue de l'arc");
        usr.setName("razika");
        usr.setIdUser(3);
        usr.setEmail("azzirazika@gmail.com");
        usr.setPrenom("azzi");
        usr.setPassword("hh11");

        return userRepository.save(usr);

    }


    @Override
    public void deleteUser(utilisateur user ) {
        userRepository.delete(user);

    }

    @Override
    public utilisateur getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Iterable<utilisateur> getAllUser(){
        return userRepository.findAll();
    }


}
