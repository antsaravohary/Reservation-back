package fil.ipint.Controller;


import fil.ipint.Service.ServiceInterface.ConcertService;
import fil.ipint.Service.ServiceInterface.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    private UserService userService;
    private ConcertService concertService;



}
