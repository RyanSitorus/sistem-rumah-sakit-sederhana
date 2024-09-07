package com.srss.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.srss.entity.UserModel;
import com.srss.entity.UserRole;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService{
	
	private static List<UserModel> users = new ArrayList<>();

    private final PasswordEncoder passwordEncoder;

    @PostConstruct
    public void postConstruct() {
        UserModel user = new UserModel();
        user.setRole(UserRole.ADMIN);
        user.setUserName("admin");
        user.setPassword(passwordEncoder.encode("abc"));
        users.add(user);
    }

    public void register(UserModel user) {
        user.setRole(UserRole.USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        users.add(user);
    }

    public UserModel findByLogin(String login) {
        return users.stream().filter(user -> user.getUserName().equals(login))
                .findFirst()
                .orElse(null);
    }

}
