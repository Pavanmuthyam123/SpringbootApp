package com.example.demo.Controller;

 

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

import com.example.demo.Model.UserModel;
import com.example.demo.Service.UserService;

 

@RestController  //requestbody or responsebody + controller
public class UserController {

 

    @Autowired
    private UserService service;

    @RequestMapping("/home1")
    public String home() {
        return "I am checking weather it is working or not";
    }


        //save
    @RequestMapping("/add")
    public UserModel addStu(@RequestBody UserModel student) {
        UserModel student2=service.addStudent(student);
        return student2;
    }

        //get
       @RequestMapping("/getAll")
        public List<UserModel> allStudents(){
            List<UserModel> allStudents=service.getAllStudents();

            return allStudents;

        }

        //delete
        @RequestMapping("/delete/{id}")
        public String deleteById(@PathVariable Integer id) {
            String str=service.deleteStudent(id);
            return str;
        }

        //update
        @RequestMapping("/update/{id}")
        public UserModel updateStudentById(@RequestBody UserModel student,@PathVariable Integer id) {
            student.setId(id);
            UserModel student2=service.updateStudent(student);
            return student2;
        }

}