package com.joaosilva.springbootcourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaosilva.springbootcourse.entities.Product;
import com.joaosilva.springbootcourse.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product finById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
