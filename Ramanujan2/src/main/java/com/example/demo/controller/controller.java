package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.user;
import com.example.demo.service.service;

@RestController  //  @RequestBody and @ResponseBody and @Controller
public class controller {

	@Autowired
	private service userService;
	
	@RequestMapping("/add")
	public String addUser(@RequestBody user user) 
	{	
		user user1=userService.add(user);
		if(user1 !=null) 
		{
			return "Data inserted successfully";
		}else 
		{
			return "Somthing went wrong";
		}	
	}
	@RequestMapping("/getAll")
	public List<user> findAllUsers(){
		List<user> users=userService.getAll();
		return users;
	}
}
