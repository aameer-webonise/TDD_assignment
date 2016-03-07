
public class EmailValidation {
boolean validate(String email)
	{
	String EMAIL_REGEX= "^[a-zA-Z]+[A-Za-z0-9+_.-]+@(.+)$";
		return email.matches(EMAIL_REGEX);
	}
}
