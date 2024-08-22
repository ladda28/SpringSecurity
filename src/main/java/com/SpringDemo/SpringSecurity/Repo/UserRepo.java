package com.SpringDemo.SpringSecurity.Repo;

import com.SpringDemo.SpringSecurity.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUserName(String username);
}
