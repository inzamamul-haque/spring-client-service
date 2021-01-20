package com.inzamamul.postgresapp.Controller;

import com.inzamamul.postgresapp.Client.clientServiceImp;
import com.inzamamul.postgresapp.Dto.UserDto;
import com.inzamamul.postgresapp.Entity.UserEntity;
import com.inzamamul.postgresapp.Service.UserService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping(value = "/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    private final clientServiceImp clientServiceImp;

    @PostMapping(value = "/create")
    public UserEntity create(@RequestBody UserDto dto) {
        LOGGER.info("Transfer Object "+dto.name);
        return userService.create(dto);
    }

    @GetMapping(value = "/getValue")
    public String getName() {
        return "This is MicroService 1";
    }
    @GetMapping("/getUserName")
    public String getUserName()
    {
        return  clientServiceImp.getName();

    }

}
