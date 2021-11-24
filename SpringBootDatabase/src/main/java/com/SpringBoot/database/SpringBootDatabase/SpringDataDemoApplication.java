package com.SpringBoot.database.SpringBootDatabase;

import com.SpringBoot.database.SpringBootDatabase.SpringData.PersonSpringDataRepository;
import com.SpringBoot.database.SpringBootDatabase.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}
	 @Autowired
	PersonSpringDataRepository repository;
	@Override
	public void run(String... args) throws Exception {

		logger.info("user find by id -> {}", repository.findById(101));
		logger.info("Inserting -> {}", repository.save(new Person("testName","PersonState", new Date())));
	}
}
