package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.UserModel;
import com.example.demo.Repository.UserRepository;
@Service
public class UserService 
{
    @Autowired
    private UserRepository repo;

    //save
    public UserModel addStudent(UserModel student) {
        UserModel student1=repo.save(student);
        return student1;
    }

    //getAll
    public List<UserModel> getAllStudents(){
        List<UserModel> allStudents=repo.findAll();
        return allStudents;
    }

    //delete
    public String deleteStudent(Integer id) {
        repo.deleteById(id);
        return "deleted successfully";
    }

    //update
    public UserModel updateStudent(UserModel student) {
        UserModel student1=repo.save(student);
        return student1;
    }

}