package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.*;

public interface repository extends JpaRepository<user, Integer>{
  //save method
	
	//public List<User> findByUserName(); //custom method
}
