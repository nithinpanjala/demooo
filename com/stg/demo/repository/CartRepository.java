package com.stg.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.demo.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
