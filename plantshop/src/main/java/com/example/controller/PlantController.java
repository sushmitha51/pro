//package com.example.controller;
//
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.service.PlantService;
//
//@RestController
//public class PlantController {
//	
//	@Autowired
//	PlantService userSer;
//	@PostMapping("/login")
//	public String validateUser(@RequestBody User u)
//	{
//		return userSer.valideteUser(u.getUsername(), u.getPassword());
//	}
//	
//	@PostMapping("/signup")
//	public User addDetails(@RequestBody User u)
//	{
//		return userSer.saveUser(u);
//	}
//
//}
