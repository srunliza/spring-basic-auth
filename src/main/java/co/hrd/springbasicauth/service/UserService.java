package co.hrd.springbasicauth.service;

import co.hrd.springbasicauth.dto.CreateUserDto;
import co.hrd.springbasicauth.dto.UserDto;
import co.hrd.springbasicauth.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto register(CreateUserDto createUserDto);
}
