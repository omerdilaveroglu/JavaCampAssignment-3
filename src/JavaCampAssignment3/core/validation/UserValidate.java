package JavaCampAssignment3.core.validation;


public interface UserValidate {
	
	public boolean eMailValidate(String mail);

	boolean validate(int id, String firstName,String lastName,String mail,String password);
}
