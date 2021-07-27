package com.learnersstop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learnersstop.entity.Customer;
import com.learnersstop.service.CustomerServiceImpl;

@SpringBootApplication
public class SpringdatajpaMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(SpringdatajpaMappingApplication.class, args);
		 Customer c = con.getBean("customer",Customer.class);
		CustomerServiceImpl cs = new CustomerServiceImpl();
		cs.addCustomer(c);
	}

}
