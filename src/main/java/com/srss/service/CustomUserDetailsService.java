
package com.srss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.srss.entity.UserModel;
import com.srss.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserModel user = userRepository.findByuserName(username);

		if (user != null) {
			return User.builder().username(user.getUserName()).password(user.getPassword()).roles(user.getRole().name())
					.build();
		}
		throw new UsernameNotFoundException("Username not found");
	}
}
