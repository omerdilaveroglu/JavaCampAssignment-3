package JavaCampAssignment3.business.concretes;

import JavaCampAssignment3.core.validation.UserValidate;
import JavaCampAssignment3.dataAccess.abstracts.UserDao;
import JavaCampAssignment3.entities.concretes.GoogleAccount;

public class GoogleManager extends BaseRegisterManager {

	public GoogleManager(UserDao userDao, UserValidate userValidate) {
		super(userDao, userValidate);

	}

	public boolean login(GoogleAccount googleAccount) {
		userDao.login(googleAccount.geteMail(), googleAccount.getPassword());
		return true;

	}

	public void register(GoogleAccount googleAccount) {

		if (userValidate.validate(googleAccount.getId(), googleAccount.getFirstName(), googleAccount.getLastName(), googleAccount.geteMail(),googleAccount.getPassword())) {
			userDao.register(googleAccount.getFirstName(),googleAccount.getLastName());
			checkOfEmailValidation();
		}

	}

}
