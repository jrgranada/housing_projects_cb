package com.practice.oauth2openidproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class Oauth2OpenidProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2OpenidProjectApplication.class, args);
	}

}
