package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.UserModel;
import com.example.demo.Service.UserService;

@RestController
public class UserController 
{
	@Autowired
 private UserService us;
	
  @PostMapping("/add")
	public String addUser(@RequestBody UserModel user)
	{
	  UserModel user1=us.add(user);
	  if(user1!=null)
	  {
		  return "Data Inserted Succussfully";
	  }
	  else
	  {
		  return "Something Wrong";
	  }
	}
  @RequestMapping("/getAll")
  public List<UserModel> get()
  {
	 List<UserModel> us1=us.getAll();
	 return us1;
  }
}
