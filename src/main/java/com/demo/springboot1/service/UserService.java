package com.demo.springboot1.service;

import com.demo.springboot1.dto.UserDto;
import com.demo.springboot1.entity.UserEntity;

public interface UserService {
	
	public UserEntity registration(UserDto dto);

}
