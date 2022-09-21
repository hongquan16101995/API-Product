package com.example.apiproduct.service;

import com.example.apiproduct.model.Category;
import com.example.apiproduct.repository.ICategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private ICategoryRepo iCategoryRepo;

    @Override
    public Optional<Category> findById(Long id) {
        return iCategoryRepo.findById(id);
    }

    @Override
    public void save(Category category) {
        iCategoryRepo.save(category);
    }

    @Override
    public void delete(Long id) {
        iCategoryRepo.deleteById(id);
    }

    @Override
    public List<Category> findAll() {
        return iCategoryRepo.findAll();
    }
}
