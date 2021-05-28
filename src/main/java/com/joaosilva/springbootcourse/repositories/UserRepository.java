package com.joaosilva.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaosilva.springbootcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
