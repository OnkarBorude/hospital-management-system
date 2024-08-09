package directory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import directory.dto.AddUserRequest;
import directory.dto.AddUserResponse;
import directory.service.AddUserService;

@RestController
public class AddUserController {
	
	@Autowired
	AddUserService addUserService;
	
	@PostMapping("/addUser")
	public AddUserResponse addUser(@RequestBody AddUserRequest addUserRequest) {
		return addUserService.addUser(addUserRequest);
	}

}
