package com.spring.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.spring.entity.AutoUser;
import com.spring.repository.AutoUserRepository;

@Component("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private AutoUserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		System.out.println("repo::::::"+repo);

		AutoUser user =  repo.findByUsername(username);
		System.out.println("user::::::"+user);
		return new User(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole()));
	}

}
