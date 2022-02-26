package com.example.productserviceapplication.service;



import com.example.productserviceapplication.entity.Product;
import com.example.productserviceapplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveEmployee(Product product) {
        return productRepository.save(product);
    }

    public Product findEmployeeById(String userId) {
        return productRepository.findEmployeeById(userId);
    }
}
