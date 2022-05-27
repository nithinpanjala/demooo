
package com.stg.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author: Panjala Nithin Kumar
 */

@Entity
@Table(name = "restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(generator = "restaurantId")
	@Column(name = "restaurantId", updatable = false, nullable = false)
	private int restaurantId;
	@Column(name = "landmark", nullable = false)
	private String restaurantName;
	@Column(name = "landmark", nullable = false)
	private String restaurantPassword;
	@Column(name = "landmark", nullable = false)
	private String restaurantAddress;
	@OneToMany(mappedBy = "restaurant")
	private Set<Dish> dishes;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(int restaurantId, String restaurantName, String restaurantPassword, String restaurantAddress,
			Set<Dish> dishes) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantPassword = restaurantPassword;
		this.restaurantAddress = restaurantAddress;
		this.dishes = dishes;
	}

	public Restaurant(int restaurantId, String restaurantName, String restaurantPassword, String restaurantAddress) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantPassword = restaurantPassword;
		this.restaurantAddress = restaurantAddress;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantPassword() {
		return restaurantPassword;
	}

	public void setRestaurantPassword(String restaurantPassword) {
		this.restaurantPassword = restaurantPassword;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public Set<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(Set<Dish> dishes) {
		this.dishes = dishes;
	}

}
