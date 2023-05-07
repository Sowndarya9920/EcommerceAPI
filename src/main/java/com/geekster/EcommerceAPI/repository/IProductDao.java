package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductDao extends JpaRepository<Product,Integer> {
    public List<Product> findByCategory(String category);

}
