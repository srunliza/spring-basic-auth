package co.hrd.springbasicauth.controller;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }

    @SecurityRequirement(name = "basicAuth")
    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin";
    }

    @SecurityRequirement(name = "basicAuth")
    @GetMapping("/user")
    public String user() {
        return "Hello User";
    }
}

