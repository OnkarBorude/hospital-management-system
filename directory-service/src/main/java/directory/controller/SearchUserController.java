package directory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import directory.dto.SearchUserResponse;
import directory.service.DeleteUserService;
import directory.service.SearchUserService;

@RestController
@RequestMapping("/directory")
public class SearchUserController {
	
	@Autowired
	SearchUserService searchUserService;
	
	@GetMapping("/search/{userId}")
	public SearchUserResponse searchUser(@PathVariable Integer userId) {
		return searchUserService.searchUser(userId);
	}

}
