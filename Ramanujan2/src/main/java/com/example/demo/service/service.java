package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.user;
import com.example.demo.repository.repository;

@Service
public class service {

	@Autowired
	private repository userRepo;
	//repository obj=new repository();
	
	public user add(user user) {
		
		user user1=userRepo.save(user);
		return user1;
		
	}
	
	public List<user> getAll(){
		List<user> users=userRepo.findAll();
		
      return users;
	}
}
