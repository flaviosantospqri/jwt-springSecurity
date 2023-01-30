package flavio.flaviospringsecurityjwt.controller;

import flavio.flaviospringsecurityjwt.model.User;
import flavio.flaviospringsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public void postUser(@RequestBody User user ){
        service.createUser(user);
    }
}
