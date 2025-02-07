package co.hrd.springbasicauth.dto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
    private Integer id;
    private String name;
    private String email;
    private String role;
}
