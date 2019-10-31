package in.gov.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.gov.master.model.User1;
import in.gov.master.services.MasterService;
import in.gov.master.services.Impl.MasterServiceImpl;

@RestController
@RequestMapping("/user")
public class MasterController {

	@Autowired 
	MasterService userService; 
	
	@GetMapping("/getuser")
	public ResponseEntity<List<User1>> getAllUser(){
		return ResponseEntity.ok().body(userService.getAllUsers());
	}  
	
}
