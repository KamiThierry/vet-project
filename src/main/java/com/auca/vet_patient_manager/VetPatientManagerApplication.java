package com.auca.vet_patient_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VetPatientManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetPatientManagerApplication.class, args);
	}

}
