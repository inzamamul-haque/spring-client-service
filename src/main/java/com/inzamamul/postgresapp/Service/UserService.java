package com.inzamamul.postgresapp.Service;

import com.inzamamul.postgresapp.Entity.UserEntity;
import com.inzamamul.postgresapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserEntity create(String name) {
        UserEntity user = new UserEntity();
        user.setName(name);
        return userRepository.save(user);
    }
}
