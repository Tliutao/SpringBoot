package com.practice.service;

import java.util.List;

import com.practice.model.User;

public interface UserService {

	public User findUserById(String id);
	
	
	public List<User> findUserPage();
}
