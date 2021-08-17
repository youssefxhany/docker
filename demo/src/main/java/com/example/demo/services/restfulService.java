package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Greeting;
import com.example.demo.repositories.GreetingRepository;

@Service
public class restfulService {
	
	@Autowired
	private GreetingRepository my_repository;
	
	restfulService(GreetingRepository my_repository){
		this.my_repository = my_repository;
	}
	
	public List<Greeting> get_all_greetings(){
		return (List<Greeting>) my_repository.findAll();
	}
	
	public Optional<Greeting> get_one_greeting_by_id(Long id) {
		return my_repository.findById(id);
	}
	
	public Long get_greeting_count() {
		return my_repository.count();
	}
	
	public List<Greeting> push_five_greetings(Long id){
		List<Greeting> my_greeting_list = new ArrayList<Greeting>();
		
		if(id + 8 > my_repository.count()) {
			while(id < my_repository.count() + 1) {
				my_greeting_list.add(  my_repository.findById(id).orElse(null) );
				id++;
			}
			return my_greeting_list;
		}
		
		for(Long i=id; i< id+8; i++) {
			my_greeting_list.add(  my_repository.findById(i).orElse(null) );
		}
		return my_greeting_list;
	}
	
}
