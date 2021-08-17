package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.demo.entities.Greeting;
import com.example.demo.repositories.GreetingRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	GreetingRepository greetingRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		for(Greeting greeting : greetingRepository.findAll()) {
			System.out.println("Greeting Id: " + greeting.get_greeting_id());
			System.out.println("Message: " + greeting.get_greeting_message());
			System.out.println("Sender name: " + greeting.get_greeting_sender_name());
			System.out.println("Receiver name: " + greeting.get_greeting_receiver_name());
			System.out.println("================================");
		}
	}

}
