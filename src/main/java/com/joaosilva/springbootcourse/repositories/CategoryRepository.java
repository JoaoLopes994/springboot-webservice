package com.joaosilva.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaosilva.springbootcourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
