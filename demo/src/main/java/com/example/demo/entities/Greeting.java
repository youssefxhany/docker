package com.example.demo.entities;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="greetings")
public class Greeting {
	
	@Id
	@Column(name="greeting_id")
	private Long greeting_id;
	
	@Column(name="greeting_message")
	private String greeting_message;
	
	@Column(name="greeting_sender_name")
	private String greeting_sender_name;
	
	@Column(name="greeting_receiver_name")
	private String greeting_receiver_name;
	
	public Long get_greeting_id() {
		return greeting_id;
	}

	public void set_greeting_id(Long greeting_id) {
		this.greeting_id = greeting_id;
	}
	
	public String get_greeting_message() {
		return greeting_message;
	}

	public void set_greeting_message(String greeting_message) {
		this.greeting_message = greeting_message;
	}
	
	public String get_greeting_sender_name() {
		return greeting_sender_name;
	}
	
	public void set_greeting_sender_name(String greeting_sender_name) {
		this.greeting_sender_name = greeting_sender_name;
	}
	
	public String get_greeting_receiver_name() {
		return greeting_receiver_name;
	}
	
	public void set_greeting_receiver_name(String greeting_receiver_name) {
		this.greeting_receiver_name = greeting_receiver_name;
	}
}
