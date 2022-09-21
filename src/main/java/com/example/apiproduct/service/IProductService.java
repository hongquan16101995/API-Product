package com.example.apiproduct.service;

import com.example.apiproduct.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Optional<Product> findById(Long id);

    void save(Product product);

    void delete(Long id);

    List<Product> findAll();
}
