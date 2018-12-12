/**
 * 
 */
package com.ariv.fe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zentere
 *
 */
@Component
public class TestScenario {

	@Value("${database.url}")
	private String email;
	
	@Value("${database.password}")
	private String ip;
	
	@Value("${secret}")
	private String secret;
	
	@Value("${spring.application.name}")
	private String name;
	
	@Value("${spring.kafka.consumer.topic}")
	private String topic;
	
//	@Value("${application.kafka.consumer.topic}")
//	private String topic;
	
	public void printEmail() {
		System.out.println(email);
		//System.out.println(topic);
	}
}
