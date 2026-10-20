package com.example.crudwithvaadin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudWithVaadinApplication {

	private static final Logger log = LoggerFactory.getLogger(CrudWithVaadinApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CrudWithVaadinApplication.class);
	}

	@Bean
	public CommandLineRunner loadData(CustomerRepository repository) {
		return (args) -> {
			// save a couple of customers with emails
			repository.save(new Customer("Jack", "Bauer", "jack.bauer@ctu.gov"));
			repository.save(new Customer("Chloe", "O'Brian", "chloe.obrian@ctu.gov"));
			repository.save(new Customer("Kim", "Bauer", "kim.bauer@example.com"));
			repository.save(new Customer("David", "Palmer", "david.palmer@senate.gov"));
			repository.save(new Customer("Michelle", "Dessler", "michelle.dessler@ctu.gov"));
			repository.save(new Customer("Cihan", "Karayigit", "cihankara70407@student.university.edu"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Customer customer = repository.findById(1L).get();
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastNameStartsWithIgnoreCase('Bauer'):");
			log.info("--------------------------------------------");
			for (Customer bauer : repository
					.findByLastNameStartsWithIgnoreCase("Bauer")) {
				log.info(bauer.toString());
			}
			log.info("");
		};
	}

}
