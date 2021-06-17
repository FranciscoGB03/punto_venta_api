package com.mishos.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.mishos.controllers", "com.mishos.services"})
@EntityScan("com.mishos.entities")
@EnableJpaRepositories("com.mishos.repositories")
public class MishoVentasApplication  extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		//SpringApplication.run(MishoVentasApplication.class, args);
		SpringApplication application = new SpringApplication(MishoVentasApplication.class);
		Map<String, Object> map = new HashMap<>();
	    map.put("server.servlet.context-path", "/misho-ventas");
	    application.setDefaultProperties(map);
	    application.run(args);
	}
}
