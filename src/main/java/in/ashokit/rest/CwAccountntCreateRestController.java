package in.ashokit.rest;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.CwAccounts;
import in.ashokit.service.CwAccountCreateService;


@RestController
public class CwAccountntCreateRestController {
	
	
	@Autowired
	private CwAccountCreateService service;
	
	
	@PostMapping("/submit")
	public ResponseEntity<String> cwaccounts(@RequestBody CwAccounts cwaccounts){
		String status = service.upsert(cwaccounts);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
		@GetMapping("/emailcheck/{email}")
		public String emailcheck(@PathVariable String email) {
			return  "valid email id";
		}
	}


