package com.joaosilva.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaosilva.springbootcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
