package com.stg.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.demo.entity.Dish;

public interface DishRepository extends JpaRepository<Dish, Integer> {

}
