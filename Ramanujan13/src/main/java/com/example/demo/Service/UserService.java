package com.example.demo.Service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.UserModel;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
private UserRepository up;
	public UserModel add(UserModel user)
	{
		UserModel pavan=up.save(user);
		return pavan;
				
	}
	
	public List<UserModel> getAll()
	{
		List<UserModel> us1=up.findAll();
		return us1;
	}
	
}
