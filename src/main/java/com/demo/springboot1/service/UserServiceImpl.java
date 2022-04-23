package com.demo.springboot1.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot1.dto.UserDto;
import com.demo.springboot1.entity.UserEntity;
import com.demo.springboot1.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	 
	UserRepository repo;

	@Override
	public UserEntity registration(UserDto dto) {
		UserEntity user= new UserEntity();
		user.setUserName(dto.getUserNm());
		user.setUserContact(dto.getUserContact());
		user.setUserEmailId(dto.getUserEmailId());
		user.setUserPassword(dto.getUserPassword());
		repo.save(user);
		return user;
	}

}
