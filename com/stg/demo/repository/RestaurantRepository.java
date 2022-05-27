package com.stg.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.demo.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
	Restaurant findByRestaurantIdAndRestaurantPassword(int restaurantId , String restaurantPassword);
}
