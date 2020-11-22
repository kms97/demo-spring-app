package com.restful.example.demo.user.entity;

import com.restful.example.demo.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
