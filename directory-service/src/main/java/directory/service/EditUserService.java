package directory.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import directory.dao.UsersDao;
import directory.dto.EditUserRequest;
import directory.dto.EditUserResponse;
import directory.entity.Users;

@Service
public class EditUserService {
	@Autowired
	UsersDao usersDao;
	
	public EditUserResponse editUser(EditUserRequest editUserRequest) {
		
		EditUserResponse editUserResponse=new EditUserResponse();

		if(editUserRequest.getUserId()==null) {
			editUserResponse.setResponseCode("0000");
			editUserResponse.setMessege("User id is mandatory");
			return editUserResponse;
		}
		
		Optional<Users> users=usersDao.findById(editUserRequest.getUserId());
		if(users.isPresent()) {
			Users userTable=new Users();
			userTable.setUserId(editUserRequest.getUserId());
			userTable.setUserName(editUserRequest.getUserName());
			userTable.setEmail(editUserRequest.getEmail());
			userTable.setMobileNumber(editUserRequest.getMobileNumber());
			userTable.setRole(editUserRequest.getRole());
			userTable.setPassword(editUserRequest.getPassword());
			usersDao.save(userTable);
			
			
			editUserResponse.setResponseCode("0000");
			editUserResponse.setMessege("User Update Suceesfully");
			editUserResponse.setEditUserRequest(editUserRequest);
			return editUserResponse;
		}
		else {
			editUserResponse.setResponseCode("911");
			editUserResponse.setMessege("User Updation Unsuceesful");
			return editUserResponse;
		}
		
	}

}
