package directory.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import directory.dao.UsersDao;
import directory.dto.LoginRequest;
import directory.dto.LoginResponse;
import directory.entity.Users;

@Service
public class LoginService {
	
	@Autowired
	UsersDao usersDao;
	
	public LoginResponse userLogin(LoginRequest loginRequest) {
		
		LoginResponse loginResponse=new LoginResponse();
		Optional<Users> users=Optional.ofNullable(usersDao.findByUserNameAndPassword(loginRequest.getUser(), loginRequest.getPassword()));
		
		if(users.isPresent()) {
			loginResponse.setUserId(users.get().getUserId());
			loginResponse.setUserName(users.get().getUserName());
			loginResponse.setEmail(users.get().getEmail());
			loginResponse.setMobileNumber(users.get().getMobileNumber());
			loginResponse.setRole(users.get().getRole());
			loginResponse.setPassword(users.get().getPassword());
			loginResponse.setResponseCode("0000");
			loginResponse.setMessege("Login Successful");
			
			return loginResponse;
		}else {
			loginResponse.setResponseCode("911");
			loginResponse.setMessege("Login Unsuccessful");
			
			return loginResponse;
		}
		
		
	}

}
