package JavaCampAssignment3.core.validation;

import JavaCampAssignment3.dataAccess.concretes.HibernateUserDao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTool implements UserValidate {

	HibernateUserDao hibernateUserDao = new HibernateUserDao();

	@Override
	public boolean eMailValidate(String mail) {
		String form = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(form);
		Matcher matcher = pattern.matcher(mail);

		return matcher.matches();

	}

	@Override
	public boolean validate(int id, String firstName, String lastName, String mail, String password) {
		if (hibernateUserDao.IsYourEMailRegistered(mail)) {
			if (eMailValidate(mail)) {
				if (password.length() >= 6) {
					if (firstName.length() >= 2 && lastName.length() >= 2) {
						return true;
					}
					System.out.println("Ad ve Soyad en az iki karakter olmalidir.");
					return false;
				}
				System.out.println("Parolaniz en az 6 karakterden olusmalidir.");
				return false;
			}
			System.out.println("Email biçimi yanlis");
			return false;
		}
		System.out.println("Bu mail adresi sistemde zaten var");
		return false;
	}



}
