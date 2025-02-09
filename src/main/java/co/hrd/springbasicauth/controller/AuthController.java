package co.hrd.springbasicauth.controller;

import co.hrd.springbasicauth.base.BaseRest;
import co.hrd.springbasicauth.dto.CreateUserDto;
import co.hrd.springbasicauth.dto.UserDto;
import co.hrd.springbasicauth.entity.User;
import co.hrd.springbasicauth.mapper.UserMapStruct;
import co.hrd.springbasicauth.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody CreateUserDto createUserDto) {
        UserDto userDto = userService.register(createUserDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                BaseRest.builder()
                        .message("User registered successfully")
                        .status(true)
                        .code(HttpStatus.CREATED.value())
                        .payload(userDto)
                        .timestamp(LocalDateTime.now())
                        .build()
        );
    }
}
