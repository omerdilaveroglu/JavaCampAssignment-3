package JavaCampAssignment3;

import JavaCampAssignment3.business.concretes.BaseRegisterManager;
import JavaCampAssignment3.business.concretes.GoogleManager;
import JavaCampAssignment3.business.concretes.UserManager;
import JavaCampAssignment3.core.validation.ValidateTool;
import JavaCampAssignment3.dataAccess.concretes.HibernateUserDao;
import JavaCampAssignment3.entities.concretes.GoogleAccount;
import JavaCampAssignment3.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		

		User user1 = new User(1, "Ömer", "Dilaveroglu", "ömer@ömer.com", "ömer123");
		User user2 = new User(2, "Mert", "Baydemir", "mahmut@maahmut", "123456");
		GoogleAccount googleAccount1 = new GoogleAccount(1, "ali", "vali", "ali@vali.com","aliveli123");
		GoogleAccount googleAccount2 = new GoogleAccount(2, "a", "a", "asdasd.com","asdasd");

		UserManager userManager = new UserManager(new HibernateUserDao(), new ValidateTool());
		userManager.register(1, "Ömer", "Dilaveroglu", "ömer@öser.com", "ömer123");
		userManager.login("ömer@ömer.com", "ömer123");

		BaseRegisterManager baseUserManager = new GoogleManager(new HibernateUserDao(), new ValidateTool());
		baseUserManager.delete(user1);

		GoogleManager googleManager = new GoogleManager(new HibernateUserDao(), new ValidateTool());
		googleManager.register(googleAccount1);
		googleManager.login(googleAccount1);

	}

}
