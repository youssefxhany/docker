package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Greeting;

@Repository("GreetingRepository")
public interface GreetingRepository extends CrudRepository<Greeting,Long>{

}
