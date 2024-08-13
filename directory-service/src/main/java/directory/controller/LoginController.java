package directory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import directory.dto.LoginRequest;
import directory.dto.LoginResponse;
import directory.service.LoginService;

@RestController
@RequestMapping("/directory")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping(path="/login", consumes = {"application/json","application/xml"}, produces = {"application/json","application/xml"})
	public LoginResponse userLogin(@RequestBody LoginRequest loginRequest) {
		return loginService.userLogin(loginRequest);
	}

}
