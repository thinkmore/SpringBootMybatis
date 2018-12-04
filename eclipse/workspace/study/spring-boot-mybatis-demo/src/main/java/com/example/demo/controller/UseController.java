package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TUser;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UseController { 
	
	@Autowired
	private UserService userService;
	@RequestMapping("/get")
	public TUser getUser(@RequestParam(value = "id") Integer id)
	{
		return userService.getUser(id);
	}
	

}
