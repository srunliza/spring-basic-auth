package co.hrd.springbasicauth.service;
import co.hrd.springbasicauth.dto.CreateUserDto;
import co.hrd.springbasicauth.dto.UserDto;
import co.hrd.springbasicauth.entity.User;
import co.hrd.springbasicauth.mapper.UserMapStruct;
import co.hrd.springbasicauth.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapStruct userMapStruct;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, UserMapStruct userMapStruct, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userMapStruct = userMapStruct;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email);
    }

    @Override
    public UserDto register(CreateUserDto createUserDto) {
        createUserDto.setPassword(passwordEncoder.encode(createUserDto.getPassword()));
        User user = userRepository.save(createUserDto);
        UserDto userDto = userMapStruct.toUserDto(user);
        log.error("User registered successfully: {}", userDto);
        return userMapStruct.toUserDto(user);
    }
}
