package com.stg.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author: Panjala Nithin Kumar
 */

@Entity
@Table(name = "dish")
public class Dish {
	@Id
	@GeneratedValue(generator = "dishId")
	@Column(name = "dishId", updatable = false, nullable = false)
	private int dishId;
	@Column(name = "dishName", nullable = false)
	private String dishName;
	@Column(name = "dishPrice", nullable = false)
	private float dishPrice;
	@Column(name = "dishQuantityAvailable", nullable = false)
	private int dishQuantityAvailable;
	@Column(name = "landmark", nullable = false)
	private Boolean vegeterianType;
	@ManyToOne
	@JoinColumn(name = "restaurantId", nullable = false)
	private Restaurant restaurant;

	public Dish() {
		super();
	}

	public Dish(int dishId, String dishName, float dishPrice, int dishQuantityAvailable, Boolean vegeterianType,
			Restaurant restaurant) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.dishPrice = dishPrice;
		this.dishQuantityAvailable = dishQuantityAvailable;
		this.vegeterianType = vegeterianType;
		this.restaurant = restaurant;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public float getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(float dishPrice) {
		this.dishPrice = dishPrice;
	}

	public int getDishQuantityAvailable() {
		return dishQuantityAvailable;
	}

	public void setDishQuantityAvailable(int dishQuantityAvailable) {
		this.dishQuantityAvailable = dishQuantityAvailable;
	}

	public Boolean getVegeterianType() {
		return vegeterianType;
	}

	public void setVegeterianType(Boolean vegeterianType) {
		this.vegeterianType = vegeterianType;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}
