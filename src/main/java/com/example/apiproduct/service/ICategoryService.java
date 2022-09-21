package com.example.apiproduct.service;

import com.example.apiproduct.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    Optional<Category> findById(Long id);

    void save(Category category);

    void delete(Long id);

    List<Category> findAll();
}
