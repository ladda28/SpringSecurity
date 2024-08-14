package com.SpringDemo.SpringSecurity.Service;

import com.SpringDemo.SpringSecurity.Model.User;
import com.SpringDemo.SpringSecurity.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User UserRegister(User user) {
        return userRepo.save(user);

    }
}
