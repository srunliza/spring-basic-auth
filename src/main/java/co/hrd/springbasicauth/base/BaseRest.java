package co.hrd.springbasicauth.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseRest<T> {
    private String message;
    private Boolean status;
    private Integer code;
    private T payload;
    private LocalDateTime timestamp;
}
