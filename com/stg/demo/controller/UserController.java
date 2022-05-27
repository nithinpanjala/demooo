package com.stg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.demo.entity.User;
import com.stg.demo.service.UserServices;

@RestController
@RequestMapping(value = "/foodOperations")
public class UserController {
	
	@Autowired
	private UserServices userServices;

	@PostMapping(value = "/createUser/{userId}/{userName}/{userPassword}/{userfirstName}/{userlastName}/{usermobile}/{userEmail}")
	public User createUser(@PathVariable("userId") long userId ,@PathVariable("userName") String userName,@PathVariable("userPassword") String userPassword,@PathVariable("userfirstName") String userfirstName,@PathVariable("userlastName") String userlastName,
			@PathVariable("usermobile") String usermobile,@PathVariable("userEmail") String userEmail) {
		return userServices.userSignUp(userId, userName, userPassword, userfirstName, userlastName, usermobile, userEmail);
	}
	
	@GetMapping(value = "/getUser/{userId}/{userPassword}")
	public User readUser(@PathVariable("userId") long userId , @PathVariable("userPassword") String userPassword) {
		return userServices.readUser(userId, userPassword);
	}
	
	@PutMapping(value ="/updateUser/{userId}/{userName}/{userPassword}/{userfirstName}/{userlastName}/{usermobile}/{userEmail}")
	public User updateUser(@PathVariable("userId") long userId ,@PathVariable("userName") String userName,@PathVariable("userPassword") String userPassword,@PathVariable("userfirstName") String userfirstName,@PathVariable("userlastName") String userlastName,
			@PathVariable("usermobile") String usermobile,@PathVariable("userEmail") String userEmail) {
		return userServices.updateUser(userId, userName, userPassword, userfirstName, userlastName, usermobile, userEmail);
	}
	
	@DeleteMapping(value="/deleteUser/{userId}/{userPassword}")
	public String deleteUser(@PathVariable("userId") long userId , @PathVariable("userPassword") String userPassword) {
		return userServices.deleteUser(userId, userPassword);
	}
}
