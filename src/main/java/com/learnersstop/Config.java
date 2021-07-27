package com.learnersstop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnersstop.entity.Customer;
import com.learnersstop.entity.Product;

@Configuration
public class Config {

	public Config() {
		// TODO Auto-generated constructor stub
	}
	@Bean("customer")
	public Customer getCustomer()
	{
		Product p1 = new Product(12,"ab",2,2);
		Product p2 = new Product(13,"ab",2,2);
		List<Product> lp = new ArrayList<Product>();
		lp.add(p1);
		lp.add(p2);
		Customer c = new Customer();
		c.setEmail("abbbb");
		c.setGender("m");
		c.setProducts(lp);
		c.setName("xyz");
		return c;
	}

}
