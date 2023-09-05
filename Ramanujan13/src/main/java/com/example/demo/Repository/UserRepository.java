package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.UserModel;

import java.util.List;
public interface UserRepository extends JpaRepository<UserModel,Integer>
{
 //public List<UserModel> findByUserName(String name);
}
