package directory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import directory.dto.DeleteUserResponse;
import directory.service.DeleteUserService;

@RestController
@RequestMapping("/directory")
public class DeleteUserController {
	
	@Autowired
	DeleteUserService deleteUserService;
	
	@DeleteMapping("/delete/{userId}")
	public DeleteUserResponse deleteUser(@PathVariable Integer userId) {
		return deleteUserService.deleteUser(userId);
	}

}
