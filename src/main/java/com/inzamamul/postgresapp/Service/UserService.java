package com.inzamamul.postgresapp.Service;

import com.inzamamul.postgresapp.Dto.UserDto;
import com.inzamamul.postgresapp.Entity.UserEntity;
import com.inzamamul.postgresapp.Mapper.UserMapper;
import com.inzamamul.postgresapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserEntity create(UserDto dto) {
        /*UserEntity user = new UserEntity();
        user.setName(name);
        return userRepository.save(user);*/
        return userRepository.save(UserMapper.INSTANCE.getUserEntity(dto));
    }
}
