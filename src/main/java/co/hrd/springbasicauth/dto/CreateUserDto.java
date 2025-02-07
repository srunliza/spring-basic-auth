package co.hrd.springbasicauth.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateUserDto {
    private String name;
    private String email;
    private String password;
    private String role;
}
