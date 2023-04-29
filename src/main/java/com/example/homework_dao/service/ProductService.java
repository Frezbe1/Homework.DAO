package com.example.homework_dao.service;

import com.example.homework_dao.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<String> getProductName(String name) {
        return productRepository.getProductName1(name);
    }
}