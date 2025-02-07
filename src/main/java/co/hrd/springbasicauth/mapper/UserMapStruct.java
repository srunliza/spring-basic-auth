package co.hrd.springbasicauth.mapper;

import co.hrd.springbasicauth.dto.CreateUserDto;
import co.hrd.springbasicauth.dto.UserDto;
import co.hrd.springbasicauth.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapStruct {

    User fromCreateUserDto(CreateUserDto createUserDto);
    UserDto toUserDto(User user);
}
