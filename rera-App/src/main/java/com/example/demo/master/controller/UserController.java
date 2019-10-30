package com.example.demo.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.master.model.User1;
import com.example.demo.master.services.UserService;
import com.example.demo.master.services.Impl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired 
	UserService userService; 
	
	@GetMapping("/getuser")
	public ResponseEntity<List<User1>> getAllUser(){
		return ResponseEntity.ok().body(userService.getAllUsers());
	}  
	
}
