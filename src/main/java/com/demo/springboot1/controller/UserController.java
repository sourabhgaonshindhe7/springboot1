package com.demo.springboot1.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot1.dto.UserDto;
import com.demo.springboot1.entity.UserEntity;
import com.demo.springboot1.service.UserService;

@RestController



public class UserController {
	
	@Autowired UserService service;
	@PostMapping(path = "/registration") 
	        
	public UserEntity registerUser(@RequestBody UserDto dto) {
		return service.registration(dto);
	}

}
