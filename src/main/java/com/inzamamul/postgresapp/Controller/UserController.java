package com.inzamamul.postgresapp.Controller;

import com.inzamamul.postgresapp.Dto.UserDto;
import com.inzamamul.postgresapp.Entity.UserEntity;
import com.inzamamul.postgresapp.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @PostMapping(value = "/create")
    public UserEntity create(@RequestBody UserDto dto) {
        LOGGER.info("Transfer Object "+dto.name);
        return userService.create(dto);
    }

    @GetMapping(value = "/getName")
    public String getName() {
        return "Hello Rifat";
    }

}
