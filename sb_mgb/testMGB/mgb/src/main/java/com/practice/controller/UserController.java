package com.practice.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.practice.model.User;
import com.practice.service.UserService;

@Controller
public class UserController {

	@Resource(name= "userService")
	private UserService userService;

	@RequestMapping(value = "/user")
	@ResponseBody
	public String getUserById(String id) {
		User user = userService.findUserById(id);
		String userStr = JSON.toJSONString(user);
		return userStr;
	}
}
