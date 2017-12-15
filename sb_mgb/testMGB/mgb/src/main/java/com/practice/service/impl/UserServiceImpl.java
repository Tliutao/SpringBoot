package com.practice.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.practice.mapper.UserMapper;
import com.practice.model.User;
import com.practice.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;

	@Override
	public User findUserById(String id) {
		return userMapper.selectByPrimaryKey(Integer.valueOf(id));
	}

	@Override
	public List<User> findUserPage() {
		return null;
	}

}
