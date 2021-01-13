package com.inzamamul.postgresapp.Mapper;

import com.inzamamul.postgresapp.Dto.UserDto;
import com.inzamamul.postgresapp.Entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserEntity getUserEntity(UserDto userDto);
}
