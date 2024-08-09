package directory.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import directory.dao.UsersDao;
import directory.dto.SearchUserRequest;
import directory.dto.SearchUserResponse;
import directory.entity.Users;

@Service
public class SearchUserService {
	@Autowired
	UsersDao usersDao;
	
	public SearchUserResponse searchUser(Integer userId) {
		
		SearchUserResponse searchUserResponse=new SearchUserResponse();
		Optional<Users> users=usersDao.findById(userId);
		if(users.isPresent()) {
			searchUserResponse.setUserId(users.get().getUserId());
			searchUserResponse.setUserName(users.get().getUserName());
			searchUserResponse.setEmail(users.get().getEmail());
			searchUserResponse.setMobileNumber(users.get().getMobileNumber());
			searchUserResponse.setRole(users.get().getRole());
			searchUserResponse.setPassword(users.get().getPassword());
			searchUserResponse.setResponseCode("0000");
			searchUserResponse.setMessege("User Found Successfully");
			return searchUserResponse;
		}
		else {
			searchUserResponse.setResponseCode("911");
			searchUserResponse.setMessege("User Not Found");
			return searchUserResponse;
		}
		
		
	}

}
