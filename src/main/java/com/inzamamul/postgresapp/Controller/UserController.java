package com.inzamamul.postgresapp.Controller;

import com.inzamamul.postgresapp.Entity.UserEntity;
import com.inzamamul.postgresapp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/create")
    public UserEntity create(String name) {
        return userService.create(name);
    }

    @GetMapping(value = "/getName")
    public String getName() {
        return "Hello Rifat";
    }

}
