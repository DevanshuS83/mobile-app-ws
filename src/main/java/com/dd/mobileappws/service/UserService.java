package com.dd.mobileappws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.dd.mobileappws.shared.dto.UserDto;

public interface UserService extends UserDetailsService{

	public UserDto createUser(UserDto user);
}
