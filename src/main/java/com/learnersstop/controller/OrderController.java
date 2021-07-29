package com.learnersstop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learnersstop.dto.OrderRequest;
import com.learnersstop.dto.OrderResponse;
import com.learnersstop.entity.Customer;
import com.learnersstop.repository.CustomerRepository;
//import com.learnersstop.repository.ProductRepository;

@RestController
public class OrderController {
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	//@Autowired
	//private ProductRepository productRepository;
	
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request)
	{
		return customerRepository.save(request.getCustomer());
	}
	

	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders()
	{
		return customerRepository.findAll();
	}
	
	@GetMapping("/getInfo")
	public List<OrderResponse> getInfo()
	{
		return customerRepository.getJoinInformation();
	}
}
