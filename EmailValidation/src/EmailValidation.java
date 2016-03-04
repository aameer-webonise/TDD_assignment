
public class EmailValidation {
boolean validate(String email)
	{
	//String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	String EMAIL_REGEX= "^[a-zA-Z]+[A-Za-z0-9+_.-]+@(.+)$";
	//String EMAIL_REGEX= "^[a-zA-Z]+[*_.-]+[A-Za-z0-9]+@(.+)$";
		return email.matches(EMAIL_REGEX);
	}
}
