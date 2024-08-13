package directory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import directory.entity.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{
	
	public Users findByUserName(String userName);
	public Users findByUserNameAndPassword(String userName, String password);


}
