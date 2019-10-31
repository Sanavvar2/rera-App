package in.gov.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.gov.master.model.User1;
import in.gov.master.services.UserService;
import in.gov.master.services.Impl.UserServiceImpl;

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
