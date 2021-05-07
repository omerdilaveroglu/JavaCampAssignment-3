package JavaCampAssignment3.dataAccess.concretes;

import JavaCampAssignment3.dataAccess.abstracts.UserDao;
import JavaCampAssignment3.entities.concretes.GoogleAccount;
import JavaCampAssignment3.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	User user1 = new User(1,"Ömer","Dilaveroglu","ömer@ömer.com","ömer123");
	User user2 = new User(2, "Mahmut", "Cakir", "mahmut@mahmut", "maht1231");
	User user3 = new User(3, "Ali", "veli", "ali@veli.com", "ali");
	User user4 = new User(4, "Ayse", "Öztürk", "ayae@ayse.com", "ayse12345");
	GoogleAccount googleAccount1 = new GoogleAccount(1, "ali", "vali", "ali@vali.com","aliveli123");

	User[] users = { user1, user2,user3,user4,googleAccount1 };



	@Override
	public void register(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName
				+ " Üyeliginiz isleminiz basarili. Lütfen mail adresinize gelen linke tiklayarak hesabinizi dogrulayin. ");

	}
	public boolean login(String mail, String password) {
		for (User x : users) {
			if(x.geteMail() == mail) {
				if(x.getPassword() == password) {
					System.out.println("Login SuccessFully");
					return true;
				}	
			}
		}
		System.out.println("Check your username and password");
		return false;
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Üyeliginiz basari ile silinmistir.");

	}

	@Override
	public boolean IsYourEMailRegistered(String mail) {

		for (User x : users) {
			if (x.geteMail() == mail) {
				return false;
			}
		}
		return true;
	}


}
