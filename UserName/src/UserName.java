
public class UserName {

	boolean validateUserName(String userName)
	{
		String regex= "^[a-zA-Z]{5,}[^0-9\\<>'\"/;`%]*$";
		return userName.matches(regex);
	}
}
