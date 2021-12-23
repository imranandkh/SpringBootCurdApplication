package com.incedo.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.training.dao.UserRepository;
import com.incedo.training.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User addUser(User user)
	{
		User userReturn=userRepository.save(user);
		return userReturn;
	}
	
	public User updateUser(User user)
	{
		User userReturn=userRepository.save(user);
		return userReturn;
	}
	
	public User findUser(int id)
	{		
	    User userReturn=userRepository.findOne(id);
		return userReturn;
	}
	
	public void deleteUser(int id) {
		
		userRepository.delete(id);
	}
	
	

}
