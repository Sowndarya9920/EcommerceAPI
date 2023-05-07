package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.User;
import com.geekster.EcommerceAPI.repository.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserDao userDao;

    public void addUsers(User user) {
        userDao.save(user);
    }

    public List<User> getUserById(Integer userId) {
        return userDao.findByUserId(userId);
    }
}
