package com.tvrtko.hi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.tvrtko.hi.controllers.HiController;

@SpringBootApplication
@ComponentScan({"com.tvrtko.hi.controllers"})
public class HiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiApplication.class, args);
	}

}
