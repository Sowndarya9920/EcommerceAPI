package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Product;
import com.geekster.EcommerceAPI.repository.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductDao productDao;

    public void addProducts(Product product) {
        productDao.save(product);
    }

    public Iterable<Product> getAll() {
        return productDao.findAll();
    }

    public List<Product> getByCategory(String category) {
        return productDao.findByCategory(category);
    }

    public void deleteProduct(Integer productId) {
        productDao.deleteById(productId);
    }
}
