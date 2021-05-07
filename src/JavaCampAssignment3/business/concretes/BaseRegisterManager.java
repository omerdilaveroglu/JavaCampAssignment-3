package JavaCampAssignment3.business.concretes;

import java.util.Scanner;

import JavaCampAssignment3.business.abstracts.UserService;
import JavaCampAssignment3.core.validation.UserValidate;
import JavaCampAssignment3.dataAccess.abstracts.UserDao;
import JavaCampAssignment3.entities.concretes.User;

public abstract class BaseRegisterManager implements UserService {
	UserDao userDao;
	UserValidate userValidate;
	Scanner scanner = new Scanner(System.in);


	public BaseRegisterManager(UserDao userDao, UserValidate userValidate) {
		super();
		this.userDao = userDao;
		this.userValidate = userValidate;
	}

	
	public void delete(User user) { userDao.delete(user); }
		

	void checkOfEmailValidation() {
		System.out.println("hesabinizi dogrulamak icin 1 e basin, ardindan Enter' a basin");
		int result = scanner.nextInt();
		if (result != 1) {
			System.out.println("Üyelik islemi basarisiz.");
		}
		else {
			System.out.println("Üyelik dogrulama isleminiz barari ile sonuclanmistir.");
		}
		
	}



}
