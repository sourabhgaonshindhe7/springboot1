package com.demo.springboot1.entity;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(value="user") // postgresSql : name, schema
public class UserEntity {
	
	
	@Id // primary key
//	@GeneratedValue() // AUTO/ INDENTITY
	private int userId;
	@Column(name="userName")
	private String userNm;
	private String userEmailId;
	private String userPassword;
	private long userContact;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserName(String userNm) {
		this.userNm = userNm;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public long getUserContact() {
		return userContact;
	}
	public void setUserContact(long userContact) {
		this.userContact = userContact;
	}
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserEntity(int userId, String userName, String userEmailId, String userPassword, long userContact) {
		super();
		this.userId = userId;
		this.userNm = userNm;
		this.userEmailId = userEmailId;
		this.userPassword = userPassword;
		this.userContact = userContact;
	}
	
	

}
