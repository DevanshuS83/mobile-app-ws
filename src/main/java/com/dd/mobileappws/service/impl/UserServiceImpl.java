package com.dd.mobileappws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dd.mobileappws.UserRepository;
import com.dd.mobileappws.io.entity.UserEntity;
import com.dd.mobileappws.service.UserService;
import com.dd.mobileappws.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto user) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		userEntity.setEncryptedPassword("test");
		userEntity.setUserId("testUserId");
		
		UserEntity storedUserDetails = userRepository.save(userEntity);
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		
		return returnValue;
	}

}
