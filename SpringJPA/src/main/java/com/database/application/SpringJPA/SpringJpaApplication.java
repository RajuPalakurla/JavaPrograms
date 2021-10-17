package com.database.application.SpringJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.database.application.repository.PersonJPARepository;

@SpringBootApplication
@ComponentScan("com.database.application.repository")
public class SpringJpaApplication implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJPARepository personJPARepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Data for user id 10002 {} ",personJPARepository.findById(10002));
	}

}
