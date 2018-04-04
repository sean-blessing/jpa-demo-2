package com.test.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.jpademo.business.User;
import com.test.jpademo.business.UserDB;
import com.test.jpademo.business.Vendor;
import com.test.jpademo.business.VendorDB;
import com.test.jpademo.db.DBUtil;


@SpringBootApplication
public class JpaDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemo2Application.class, args);
		System.out.println("Hello");
		try {
			User u = UserDB.getUserById(1);
			System.out.println("user retrieved = "+u);
	
			Vendor v = VendorDB.getVendorById(1);
			System.out.println("vendor retrieved = "+v);
		}
		catch (Exception e) {
			System.err.println("Exception encountered!!  Details:  ");
			e.printStackTrace();
		}
		
		DBUtil.closeEMF();
		System.out.println("Bye");
	}
}
