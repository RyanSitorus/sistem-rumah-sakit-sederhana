package com.srss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.srss.entity.UserModel;
import com.srss.entity.UserRole;
import com.srss.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService{
	
	@Autowired
	private UserRepository userRepository;

	private final PasswordEncoder passwordEncoder;

//    @PostConstruct
//    public void postConstruct() {
//        UserModel user = new UserModel();
//        user.setRole(UserRole.ADMIN);
//        user.setUserName("admin");
//        user.setPassword(passwordEncoder.encode("abc"));
//        users.add(user);
//    }

	public UserModel register(UserModel userModel) {
		userModel.setRole(UserRole.USER);
		userModel.setPassword(passwordEncoder.encode(userModel.getPassword()));
		return userRepository.save(userModel);
	}

}
