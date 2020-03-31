package com.citi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class CitiApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
 
    @Autowired
    private Station_informationRepository userRepository;
 
    @Override
    public void run(String... args) throws Exception {

        logger.info("All users -> {}", userRepository.findAll());
        
    }
 
    public static void main(String[] args) {
        SpringApplication.run(CitiApplication.class, args);
    }
}
