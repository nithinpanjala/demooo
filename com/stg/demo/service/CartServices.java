package com.stg.demo.service;
import com.stg.demo.entity.Cart;
import com.stg.demo.entity.Dish;
public interface CartServices {

	public Cart addDish(int cartNo ,Dish dish,int quantity);
	public	Cart removeDish(int cartNo ,Dish dish);
	public	Cart updateDishQuantity(int cartNo ,Dish dish , int quantity);
	public	Float getTotalPrice(int cartNo ,Cart cart);
	public	Float getTotalPriceAfterDiscount(int cartNo ,Float discount);
	public	Cart PlaceOrder(int cartNo ,Cart cart);

}
