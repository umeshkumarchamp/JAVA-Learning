package com.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repository.UserRepository;
import com.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	} 
	

}
