package table.practice.table.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import table.practice.table.Model.User;
import table.practice.table.Repository.IRepository;

import java.awt.*;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private IRepository irepository;

    @GetMapping(value = "/users")
    public List<User> getUser(){
        return irepository.findAll();
    }

    @PostMapping(value = "/saveuser")
    public String saveUser(@RequestBody User user){
        irepository.save(user);
        return "User has been save! :)";
    }
    @DeleteMapping(value = "/deleteuser")
    public String deleteUser(@RequestBody User user){
        irepository.delete(user);
        return "User Deleted Successfully! ";
    }


}
