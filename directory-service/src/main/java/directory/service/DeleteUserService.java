package directory.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import directory.dao.UsersDao;
import directory.dto.DeleteUserResponse;
import directory.entity.Users;

@Service
public class DeleteUserService {
	@Autowired
	UsersDao usersDao;
	
	public DeleteUserResponse deleteUser(Integer userId) {
		DeleteUserResponse deleteUserResponse=new DeleteUserResponse();
		Optional<Users> users=usersDao.findById(userId);
		if(users.isPresent()) {
			usersDao.deleteById(userId);
			deleteUserResponse.setResponseCode("0000");
			deleteUserResponse.setMessege("User Deleted Successfully");
			return deleteUserResponse;
		}
		else {
			deleteUserResponse.setResponseCode("911");
			deleteUserResponse.setMessege("User Deletion Unsuccessful");
			return deleteUserResponse;
		}
	}

}
