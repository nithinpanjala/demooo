package com.stg.demo.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.demo.entity.Address;
import com.stg.demo.entity.User;
import com.stg.demo.repository.AddressRepository;
import com.stg.demo.repository.UserRepository;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public User Userlogin(long UserId) {
		// TODO Auto-generated method stub
		return userRepository.getById(UserId);
	}

	@Override
	public User userSignUp(long userId, String userName, String userPassword, String userfirstName, String userlastName,
			String usermobile, String userEmail) {
		// TODO Auto-generated method stub
		User user= new User(userId,userName, userPassword, userfirstName,userlastName,
			usermobile,userEmail );
		return userRepository.save(user);
	}

	@Override
	public User updateUser(long userId, String userName, String userPassword, String userfirstName, String userlastName,
			String usermobile, String userEmail) {
		User user= new User(userId,userName, userPassword, userfirstName,userlastName,
				usermobile,userEmail );
			return userRepository.save(user);
	}

	@Override
	public User readUser(long userId,  String userPassword) {
		return userRepository.findByUserIdAndPassword(userId, userPassword);
	}

	@Override
	public String deleteUser(long userId, String userPassword) {
		User user = userRepository.getById(userId);
		if(user.getUserPassword().equals(userPassword)) {
			userRepository.delete(user);
			return "User "+user.getUserfirstName()+" is deleted ";
		}else {
			return "User Id and password does not match";
		}
	}

	@Override
	public User addAddress(int addressId, String houseNumber, String addressLane1, String addressLane2, String landmark,
			int pincode, String district, String state, User user) {
		Address address = new Address( addressId,  houseNumber,  addressLane1,  addressLane2, landmark,
				 pincode,  district,  state,  user);
		addressRepository.save(address);
		return user;
	}

	@Override
	public User readUser(long userId, String userName, String userPassword, String userfirstName, String userlastName,
			String usermobile, String userEmail, Set<Address> addresses) {
		return userRepository.findByUserIdAndPassword(userId, userPassword);
	}

}
