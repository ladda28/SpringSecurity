package com.SpringDemo.SpringSecurity.Controller;

import com.SpringDemo.SpringSecurity.Model.User;
import com.SpringDemo.SpringSecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/home")
    public String Home() {
        return "In Home page";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/page1")
    public String  page1() {
        return "In page1";
    }


    @PostMapping("/register")
    public User UserRegister(@RequestBody User user) {
        return userService.UserRegister(user);
    }

}
