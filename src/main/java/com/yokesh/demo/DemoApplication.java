package com.yokesh.demo;

import com.yokesh.demo.runClass.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class DemoApplication {
	private static final Logger l = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		var sasi = new Helloworld();
//		System.out.println(sasi.welcomeMessage());
//		l.info("Logger Intro");
//		l.info("Logger Intro Changed");

	}


}
