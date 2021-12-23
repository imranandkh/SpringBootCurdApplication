package com.incedo.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.incedo.training.entity.User;
import com.incedo.training.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user)
	{
		User userReturn=userService.addUser(user);		
		return userReturn;
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user)
	{
		User userReturn=userService.updateUser(user);
		return userReturn;
	}
	
	@GetMapping("/finduser/{id}")
	public User findUser(@PathVariable int id)
	{		
	    User userReturn=userService.findUser(id);
		return userReturn;
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public void deleteUser(@PathVariable int id) {
		
		userService.deleteUser(id);
	}

}
