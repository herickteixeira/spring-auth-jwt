package com.auth.auth.service;

import com.auth.auth.domain.Role;
import com.auth.auth.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    void deleteUserById(Long id);
    User getUser(String username);
    List<User> getUsers();
}