package com.example.rest.webservices.springaop;

import com.example.rest.webservices.springaop.services.bussiness.BusinessService1;
import com.example.rest.webservices.springaop.services.bussiness.BusinessService2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
	private BusinessService1 businessService1;
	private BusinessService2 businessService2;

	private Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	public SpringAopApplication(BusinessService1 businessService1, BusinessService2 businessService2) {
		this.businessService1 = businessService1;
		this.businessService2 = businessService2;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Value returned by calculateMax() is: {}", businessService1.calculateMax());
		logger.info("Value returned by calculateMax() is: {}", businessService2.calculateMin());
	}

}
