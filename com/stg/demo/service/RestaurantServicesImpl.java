package com.stg.demo.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.demo.entity.Dish;
import com.stg.demo.entity.Restaurant;
import com.stg.demo.repository.RestaurantRepository;

@Service
public class RestaurantServicesImpl implements RestaurantServices {

	@Autowired
	RestaurantRepository restaurantRepository;
	
	
	@Override
	public Restaurant restaurantLogin(int RestaurantId, String RestaurantPassword) {
		return restaurantRepository.findByRestaurantIdAndRestaurantPassword(RestaurantId, RestaurantPassword);
	}



	@Override
	public Restaurant updateRestaurant(int restaurantId, String restaurantName, String restaurantPassword,
			String restaurantAddress) {
		Restaurant restaurant = new Restaurant(restaurantId, restaurantName, restaurantPassword, restaurantAddress);
		return restaurantRepository.save(restaurant);
	}

	@Override
	public Restaurant readRestaurant(int restaurantId, String restaurantPassword) {
		return restaurantRepository.findByRestaurantIdAndRestaurantPassword(restaurantId, restaurantPassword);
	}

	@Override
	public String deleteRestaurant(int restaurantId, String restaurantPassword) {
		// TODO Auto-generated method stub
		Restaurant restaurant= restaurantRepository.findByRestaurantIdAndRestaurantPassword(restaurantId, restaurantPassword);
		if(restaurant == null) {
			return "invalid restaurant id and password";
		}
		else {
		restaurantRepository.delete(restaurant);
		return "Restaurant " + restaurant.getRestaurantName()+ " is deleted ";
		}
	}



	@Override
	public Restaurant restaurantSignUp(int restaurantId, String restaurantName, String restaurantPassword,
			String restaurantAddress) {
		Restaurant restaurant = new Restaurant(restaurantId, restaurantName, restaurantPassword, restaurantAddress);
		return restaurantRepository.save(restaurant);
	}

}
