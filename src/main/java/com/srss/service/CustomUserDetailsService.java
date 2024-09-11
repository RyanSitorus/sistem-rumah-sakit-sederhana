
package com.srss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.srss.entity.UserModel;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel byName = userService.findByName(username);
        if (byName == null) {
            return null;
        }
        return User.builder()
                .username(byName.getUserName())
                .password(byName.getPassword())
                .roles(byName.getRole().name())
                .build();
    }
}
