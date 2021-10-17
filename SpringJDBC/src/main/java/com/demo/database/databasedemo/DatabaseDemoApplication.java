package com.demo.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.database.databasedemo.Jdbc.PersonJdbcDao;
import com.demo.database.databasedemo.entity.Person;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private Logger logger= LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao personJdbcDao;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("\nGetting all Data from newBeanRowMapper function");
		logger.info("All User Data : {}",personJdbcDao.findAll());
		logger.info("\nGetting all Data from personRowMapper function");
		logger.info("\nAll User Data : {}",personJdbcDao.findAllByRowMapper());
		logger.info("\nData for UserId 10001 : {}",personJdbcDao.findById(10001));
		logger.info("\ndeleting UserId 10002 -> Number of rows deleted \n{}",personJdbcDao.deleteById(10002));
		logger.info("\nInserting UserId 10004 -> Number of rows inserted \n{}",
				personJdbcDao.insert(new Person(10004,
						"Tara",
						"Berlin",
						new Date())));
		logger.info("\nupdating UserId 10003 -> Number of rows updated \n{}",
				personJdbcDao.update(new Person(10003,
						"Sai",
						"Amsterdam",
						new Date())));
	}

}
