package com.database.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class JobportalApplication {
	public static void main(String[] args) {
		SpringApplication.run(JobportalApplication.class, args);
	}
}
