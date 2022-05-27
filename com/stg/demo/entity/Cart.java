package com.stg.demo.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	@Id
	@GeneratedValue(generator = "cartNo")
	@Column(name = "cartNo", updatable = false, nullable = false)
	private int cartNo;
	@Column(name = "DeliveryCharges", nullable = false)
	private float DeliveryCharges;
	@Column(name = "Discount", nullable = false)
	private float Discount;
	@Column(name = "TotalPrice", nullable = false)
	private float TotalPrice;

	   @ElementCollection
	    @CollectionTable(name = "Dish", 
	      joinColumns = {@JoinColumn(name = "dishId", referencedColumnName = "dishId")})
	    @MapKeyColumn(name = "dishId")
	    @Column(name = "quantity")
	private Map<Integer, Integer> dishes ;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cartNo, float deliveryCharges, float discount, float totalPrice) {
		super();
		this.cartNo = cartNo;
		DeliveryCharges = deliveryCharges;
		Discount = discount;
		TotalPrice = totalPrice;
	}


	public Cart(int cartNo, float deliveryCharges, float discount, float totalPrice, Map<Integer, Integer> dishes) {
		super();
		this.cartNo = cartNo;
		DeliveryCharges = deliveryCharges;
		Discount = discount;
		TotalPrice = totalPrice;
		this.dishes = dishes;
	}

	public int getCartNo() {
		return cartNo;
	}

	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}

	public float getDeliveryCharges() {
		return DeliveryCharges;
	}

	public void setDeliveryCharges(float deliveryCharges) {
		DeliveryCharges = deliveryCharges;
	}

	public float getDiscount() {
		return Discount;
	}

	public void setDiscount(float discount) {
		Discount = discount;
	}

	public float getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		TotalPrice = totalPrice;
	}

	public Map<Integer, Integer> getDishes() {
		return dishes;
	}

	public void setDishes(Map<Integer, Integer> dishes) {
		this.dishes = dishes;
	}

	
}
