package com.auth.authentication;

import com.auth.authentication.domain.Role;
import com.auth.authentication.domain.User;
import com.auth.authentication.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class AuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "Herick Teixeira", "herick", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "João Silva", "joao", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Maria Rodrigues", "maria", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Pedro Cardozo", "pedro", "1234", new ArrayList<>()));

            userService.addRoleToUser("joao", "ROLE_USER");
            userService.addRoleToUser("maria", "ROLE_MANAGER");
            userService.addRoleToUser("pedro", "ROLE_ADMIN");
            userService.addRoleToUser("herick", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("herick", "ROLE_ADMIN");
            userService.addRoleToUser("herick", "ROLE_USER");
        };
    }
}
