package com.comrade.EasyRide.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comrade.EasyRide.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
