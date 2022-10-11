package com.lucasreis.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@RestController
public class ParkingControlApplication {

	public static void main(String[] args) { 
		SpringApplication.run(ParkingControlApplication.class, args);}
	
		@GetMapping("/") 
		public String teste() {
			return "<h1> Olá Mundo <h1>";
	}

}
