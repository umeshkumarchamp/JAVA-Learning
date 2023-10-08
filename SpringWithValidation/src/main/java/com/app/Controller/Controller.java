package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.serviceImpl.UserServiceImpl;

@RestController
public class Controller {

	@Autowired
	private UserServiceImpl usi;
	
	@PostMapping("/addNewUser")
	public User addUser(@RequestBody User user) {
		return usi.addNewUser(user);
		
	}
}
