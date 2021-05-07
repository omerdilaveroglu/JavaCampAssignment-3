package JavaCampAssignment3.business.concretes;

import JavaCampAssignment3.core.validation.UserValidate;
import JavaCampAssignment3.dataAccess.abstracts.UserDao;


public class UserManager extends BaseRegisterManager {

	public UserManager(UserDao userDao, UserValidate userValidate) {
		super(userDao, userValidate);
		
	}
	public boolean login(String mail, String password) {
		userDao.login(mail, password);
		return true;
	}

	public void register(int id, String firstName,String lastName,String mail , String password) {
		
		if (userValidate.validate(id,firstName,lastName,mail,password)) {
			userDao.register(firstName,lastName);
			checkOfEmailValidation();
		}
		
	}
	
}
