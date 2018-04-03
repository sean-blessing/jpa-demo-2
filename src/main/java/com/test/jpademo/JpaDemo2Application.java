package com.test.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.jpademo.business.User;
import com.test.jpademo.business.UserDB;

@SpringBootApplication
public class JpaDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemo2Application.class, args);
		System.out.println("Hello");
		
		User u = UserDB.getUserById(1);
		System.out.println("user retrieved = "+u);
		
		System.out.println("Bye");
	}
}
