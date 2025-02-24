package co.hrd.springbasicauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class InMemorySecurityConfig {
//    private final PasswordEncoder passwordEncoder;
//
//    public InMemorySecurityConfig(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }

    // Create user authentication
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user1 = User.builder()
//                .username("user")
//                .password(passwordEncoder.encode("123"))
//                .roles("USER")
//                .build();
//        UserDetails user2 = User.builder()
//                .username("admin")
//                .password(passwordEncoder.encode("123"))
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user1, user2);
//    }

    // Create user authorization
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity
//                .authorizeHttpRequests(request -> request
//                        .requestMatchers("/test").permitAll()
//                        .requestMatchers("/admin").hasRole("ADMIN")
//                        .requestMatchers("/user").hasAnyRole("USER", "ADMIN")
//                        .anyRequest().authenticated()
//                ).formLogin(Customizer.withDefaults())
//                .httpBasic(Customizer.withDefaults());
//        return httpSecurity.build();
//    }

}

