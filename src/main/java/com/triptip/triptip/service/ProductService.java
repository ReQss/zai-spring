package com.triptip.triptip.service;

import com.triptip.triptip.model.Product;
import com.triptip.triptip.model.User;
import com.triptip.triptip.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin("http://localhost:3000")
public class ProductService {
    @Autowired
    public ProductRepository productRepository;
    public List <Product> getAllProducts(){return productRepository.findAll();}

}
