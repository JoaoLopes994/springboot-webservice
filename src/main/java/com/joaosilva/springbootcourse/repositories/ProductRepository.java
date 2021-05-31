package com.joaosilva.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaosilva.springbootcourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
