package com.learnersstop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnersstop.entity.Customer;
import com.learnersstop.repository.CustomerRepository;
@Service("CustomerService")
public class CustomerServiceImpl {

	@Autowired
	private CustomerRepository cusr;
	
	
	public void addCustomer(Customer c)
	{
		cusr.save(c);
	}
}
