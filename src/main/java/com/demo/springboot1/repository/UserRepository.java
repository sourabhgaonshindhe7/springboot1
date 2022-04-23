package com.demo.springboot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springboot1.entity.UserEntity;
@Repository
public interface UserRepository 
extends JpaRepository<UserEntity,Integer>
{ 
	


}
