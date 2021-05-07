package JavaCampAssignment3.dataAccess.abstracts;

import JavaCampAssignment3.entities.concretes.User;

public interface UserDao {

	public void register(String firstName, String lastName);
	public boolean login(String mail, String password);
	public void delete(User user);
	public boolean IsYourEMailRegistered(String mail);
	
}
