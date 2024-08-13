package directory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import directory.dto.EditUserRequest;
import directory.dto.EditUserResponse;
import directory.service.EditUserService;

@RestController
@RequestMapping("/directory")
public class EditUserController {
	
	@Autowired
	EditUserService editUserService;
	
	@PostMapping("/edit")
	public EditUserResponse editUser(@RequestBody EditUserRequest editUserRequest) {
		return editUserService.editUser(editUserRequest);
	}

}
