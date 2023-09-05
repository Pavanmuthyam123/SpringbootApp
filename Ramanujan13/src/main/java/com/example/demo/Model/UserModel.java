package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserModel 
{
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int id;
 private String name;
 private String branch;
 private long num;
 
 
public UserModel() {
	super();
	// TODO Auto-generated constructor stub
}
public UserModel(int id, String name, String branch, long num) 
{
	this.id = id;
	this.name = name;
	this.branch = branch;
	this.num = num;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public long getNum() {
	return num;
}
public void setNum(long num) {
	this.num = num;
}
@Override
public String toString() {
	return "FirstModel [id=" + id + ", name=" + name + ", branch=" + branch + ", num=" + num + "]";
}
 
}
