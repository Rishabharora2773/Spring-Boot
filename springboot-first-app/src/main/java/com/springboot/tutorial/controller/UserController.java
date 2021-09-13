package com.springboot.tutorial.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springboot.tutorial.model.*;

@Controller
public class UserController {
	
	@RequestMapping("demo")
	public String demo(Model model) {
		model.addAttribute("message", "Hello from Thymeleaf!");
		model.addAttribute("name", "Rishab");
		double grade = 90.5;
		model.addAttribute("grade", grade);
		model.addAttribute("GPA", convertToGPA(grade));
		// redirect to templates/demo.html page
		return "demo";
	}
	
	private String convertToGPA(double grade) {
		if (grade >= 90) {
	       return "A";
	   } else if (grade < 90 && grade >= 80) {
	       return "B";
	   } else if (grade < 80 && grade >= 70) {
	       return "C";
	   } else if (grade < 70 && grade >= 60) {
	       return "D";
	   } else {
	       return "F";
	   }
	}
	
	@RequestMapping("users")
	public String getUsers(Model model) {
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("Rishab", 1, 24));
		users.add(new User("Kashish", 2, 25));
		users.add(new User("Vikash", 3, 26));
		model.addAttribute("users", users);
		
		return "demo2";
	}
}
