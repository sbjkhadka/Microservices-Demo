package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    // fake user list
    List<User> list= List.of(
            new User(1311L, "Subarna", "123456789"),
            new User(1312L, "Susan", "234567891"),
            new User(1313L, "Anima", "345678912"),
            new User(1314L, "Manish", "456789123")
    );
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId() == id).findAny().orElse(null);
    }
}
