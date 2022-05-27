package com.stg.demo.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.demo.entity.Dish;
import com.stg.demo.entity.Restaurant;
import com.stg.demo.repository.DishRepository;

@Service
public class DishesServicesImpl implements DishesServices {

	@Autowired
	DishRepository dishRepository;
	
	@Override
	public Set<Dish> addDishes(Dish dish) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dish UpdateDish(int dishId, String dishName, String dishPrice, int dishQuantityAvailable,
			Boolean vegeterianType, Restaurant restaurant) {
		Dish dish = new Dish(dishId, dishName, dishPrice, dishQuantityAvailable, vegeterianType, restaurant);
		return dishRepository.save(dish);
	}

	@Override
	public Dish createDish(int dishId, String dishName, String dishPrice, int dishQuantityAvailable,
			Boolean vegeterianType, Restaurant restaurant) {
		Dish dish = new Dish(dishId, dishName, dishPrice, dishQuantityAvailable, vegeterianType, restaurant);
		return dishRepository.save(dish);
	}

	@Override
	public Dish deleteDish(int dishId) {
		Dish dish= dishRepository.getById(dishId);
		dishRepository.delete(dish);
		return dish;
	}

	@Override
	public Dish updateDishQuantity(int quantity, int dishId) {
		Dish dish= dishRepository.getById(dishId);
		dish.setDishQuantityAvailable(quantity);
		dishRepository.save(dish);
		return dish;
	}

	@Override
	public Dish readDish(int DishId) {
		return dishRepository.getById(DishId);
	}

	@Override
	public List<Dish> readAllDishes() {
		return dishRepository.findAll();
	}

}
