package com.example.apiproduct.service;

import com.example.apiproduct.model.Product;
import com.example.apiproduct.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepo iProductRepo;

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepo.findById(id);
    }

    @Override
    public void save(Product product) {
        iProductRepo.save(product);
    }

    @Override
    public void delete(Long id) {
        iProductRepo.deleteById(id);
    }

    @Override
    public List<Product> findAll() {
        return iProductRepo.findAll();
    }
}
