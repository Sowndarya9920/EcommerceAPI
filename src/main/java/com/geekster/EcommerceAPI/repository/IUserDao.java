package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao extends JpaRepository<User,Integer> {
    public List<User> findByUserId(Integer userId);

}
