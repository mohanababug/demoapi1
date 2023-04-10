package com.mg.ocp.api.demoapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoapisApplication {
	@GetMapping("/names")
	public String getNames(){
		return "Ram Bheem Arjun";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoapisApplication.class, args);
	}

}
