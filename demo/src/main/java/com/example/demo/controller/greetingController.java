package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Greeting;
import com.example.demo.repositories.GreetingRepository;
import com.example.demo.services.restfulService;

@RestController
public class greetingController {
	
	/*private final GreetingRepository my_repository;
	
	greetingController(GreetingRepository my_repository){
		this.my_repository = my_repository;
	}*/
	
	@Autowired
	private restfulService my_restfulService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/greetings")
	List<Greeting> all(){
		return my_restfulService.get_all_greetings();
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/greetings/push/{id}")
	List<Greeting> push_greetings(@PathVariable Long id){
		return my_restfulService.push_five_greetings(id);
	}
	
	@GetMapping("/greetings/{id}")
	Optional<Greeting> one(@PathVariable Long id) {
	    
	    //return my_repository.findById(id);
	    return my_restfulService.get_one_greeting_by_id(id);
	    //.orElseThrow(() -> System.out.println("Greeting Id: " + greeting.get_greeting_id()));
	  }
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/greetings/get_count")
	Long get_count(){
		return my_restfulService.get_greeting_count();
	}
	
}
