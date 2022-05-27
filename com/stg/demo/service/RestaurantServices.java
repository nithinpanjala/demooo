package com.stg.demo.service;

import java.util.Set;

import com.stg.demo.entity.Dish;
import com.stg.demo.entity.Restaurant;

public interface RestaurantServices {
	public Restaurant restaurantLogin(int RestaurantId, String RestaurantPassword);

	public Restaurant restaurantSignUp(int restaurantId, String restaurantName, String restaurantPassword,
			String restaurantAddress); // create

	public Restaurant updateRestaurant(int restaurantId, String restaurantName, String restaurantPassword,
			String restaurantAddress); // update

	public Restaurant readRestaurant(int restaurantId, String restaurantPassword); // read

	public String deleteRestaurant(int restaurantId,  String restaurantPassword); // delete

}
