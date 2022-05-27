package com.stg.demo.service;

import java.util.Set;

import com.stg.demo.entity.Address;
import com.stg.demo.entity.User;

public interface UserServices {
	public User Userlogin(long UserId);

	public User userSignUp(long userId, String userName, String userPassword, String userfirstName, String userlastName,
			String usermobile, String userEmail); // create

	public User updateUser(long userId, String userName, String userPassword, String userfirstName, String userlastName,
			String usermobile, String userEmail); // update

	public User readUser(long userId, String userName, String userPassword, String userfirstName, String userlastName,
			String usermobile, String userEmail, Set<Address> addresses); // read

	public String deleteUser(long userId, String userPassword);

	public User addAddress(int addressId, String houseNumber, String addressLane1, String addressLane2, String landmark,
			int pincode, String district, String state, User user);

	public User readUser(long userId, String userPassword);

}
