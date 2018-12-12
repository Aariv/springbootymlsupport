package com.ariv.fe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MfccFeatureExtraction1Application implements CommandLineRunner {

	@Autowired
	private TestScenario scenario;
	
	public static void main(String[] args) {
		SpringApplication.run(MfccFeatureExtraction1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		scenario.printEmail();
	}

}

