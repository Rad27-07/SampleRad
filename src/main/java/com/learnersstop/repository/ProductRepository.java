package com.learnersstop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnersstop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
