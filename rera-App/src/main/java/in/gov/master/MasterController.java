package in.gov.master;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MasterController {

	@GetMapping("/test")
	public ResponseEntity<?> get(){
		return ResponseEntity.ok().body("hello");
	}
	
}
