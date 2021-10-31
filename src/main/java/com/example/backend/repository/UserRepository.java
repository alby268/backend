package com.example.backend.repository;

import com.example.backend.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser() {

        User user = new User("albin","blueberry",26);
        return user;
    }

}
