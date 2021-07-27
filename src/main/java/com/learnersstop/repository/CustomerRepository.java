package com.learnersstop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.learnersstop.dto.OrderResponse;
import com.learnersstop.entity.Customer;
@Repository("CustomerRepo")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query("SELECT new com.learnersstop.dto.OrderResponse(c.name , p.pname) FROM Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInformation();
}

