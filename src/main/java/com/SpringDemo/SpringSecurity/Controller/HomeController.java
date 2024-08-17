package com.SpringDemo.SpringSecurity.Controller;

import com.SpringDemo.SpringSecurity.Model.User;
import com.SpringDemo.SpringSecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/home")
    public String Home() {
        return "In Home page";
    }

    @PostMapping("/register")
    public User UserRegister(@RequestBody User user) {
        return userService.UserRegister(user);
    }
//    @PostMapping("/login")
//    public User UserRegister(@RequestBody User user) {
//        return userService.UserRegister(user);
//    }
@PostMapping("/login")
public String UserRegister() {
    return "userService.UserRegister(user)";
}
}
