package directory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import directory.dto.LoginRequest;
import directory.dto.LoginResponse;
import directory.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/login")
	public LoginResponse userLogin(@RequestBody LoginRequest loginRequest) {
		return loginService.userLogin(loginRequest);
	}

}
