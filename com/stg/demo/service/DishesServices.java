package com.stg.demo.service;

import java.util.List;
import java.util.Set;

import com.stg.demo.entity.Dish;
import com.stg.demo.entity.Restaurant;

public interface DishesServices {

	public Set<Dish> addDishes(Dish dish);

	public Dish UpdateDish(int dishId, String dishName, String dishPrice, int dishQuantityAvailable,
			Boolean vegeterianType, Restaurant restaurant);

	public Dish createDish(int dishId, String dishName, String dishPrice, int dishQuantityAvailable,
			Boolean vegeterianType, Restaurant restaurant);

	public Dish deleteDish(int dishId);

	public Dish updateDishQuantity(int quantity, int dishId);

	public Dish readDish(int DishId);

	public List<Dish> readAllDishes();

}
