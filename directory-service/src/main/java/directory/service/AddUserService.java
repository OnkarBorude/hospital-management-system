package directory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import directory.dao.UsersDao;
import directory.dto.AddUserRequest;
import directory.dto.AddUserResponse;
import directory.entity.Users;

@Service
public class AddUserService {
	@Autowired
	UsersDao usersDao;
	
	public AddUserResponse addUser(AddUserRequest addUserRequest) {
		
		AddUserResponse addUserResponse=new AddUserResponse();
		Users users=new Users();
		
		users.setUserName(addUserRequest.getUserName());
		users.setMobileNumber(addUserRequest.getMobileNumber());
		users.setEmail(addUserRequest.getEmail());
		users.setRole(addUserRequest.getRole());
		users.setPassword(addUserRequest.getPassword());
		Users user=usersDao.save(users);
		
		addUserResponse.setResponseCode("0000");
		addUserResponse.setMessege("User Added Successfully");
		addUserRequest.setUserId(user.getUserId());
		addUserResponse.setAddUserRequest(addUserRequest);
		
		return addUserResponse;
	}

}
