package com.joaosilva.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaosilva.springbootcourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
