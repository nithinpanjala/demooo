package com.stg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.demo.entity.Restaurant;
import com.stg.demo.service.RestaurantServices;

@RestController
@RequestMapping(value = "/RestaurantOperations")
public class RestaurantController {

	@Autowired
	RestaurantServices restaurantServices;

	@PostMapping(value = "/createRestaurant/{restaurantId}/{restaurantName}/{restaurantPassword}/{restaurantAddress}")
	public Restaurant createRestaurant(@PathVariable("restaurantId") int restaurantId, @PathVariable("restaurantName") String restaurantName,
			@PathVariable("restaurantPassword") String restaurantPassword, @PathVariable("restaurantAddress") String restaurantAddress) {
		return restaurantServices.restaurantSignUp(restaurantId, restaurantName, restaurantPassword, restaurantAddress);
	}

	@GetMapping(value = "/getRestaurant/{restaurantId}/{restaurantPassword}")
	public Restaurant readRestaurant(@PathVariable("restaurantId") int restaurantId,
			@PathVariable("restaurantPassword") String restaurantPassword) {
		return restaurantServices.readRestaurant(restaurantId, restaurantPassword);
	}

	@PutMapping(value = "/updateRestaurant/{restaurantId}/{restaurantName}/{restaurantPassword}/{restaurantAddress}")
	public Restaurant updateRestaurant(@PathVariable("restaurantId") int restaurantId,
			@PathVariable("restaurantName") String restaurantName,
			@PathVariable("restaurantPassword") String restaurantPassword,
			@PathVariable("restaurantAddress") String restaurantAddress) {
		return restaurantServices.updateRestaurant(restaurantId, restaurantName, restaurantPassword, restaurantAddress);
	}

	@DeleteMapping(value = "/deleteRestaurant/{restaurantId}/{restaurantPassword}")
	public String deleteRestaurant(@PathVariable("restaurantId") int restaurantId,
			@PathVariable("restaurantPassword") String restaurantPassword) {
		return restaurantServices.deleteRestaurant(restaurantId, restaurantPassword);
	}
}
