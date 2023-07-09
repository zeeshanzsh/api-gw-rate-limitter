package com.zeeshan.userservice.route;

import com.zeeshan.userservice.dao.UserRepository;
import com.zeeshan.userservice.model.Users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String index(){
        return "User service is up";
    }
    @GetMapping("/users")
    public List<Users> users(){
        log.info("Get all the users");
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public Users user(@RequestBody Users user){
        log.info("Saving User Data: {}", user);
        return userRepository.save(user);
    }
}
