package com.stg.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	  User findByUserIdAndPassword(long userId, String userPassword);
}
