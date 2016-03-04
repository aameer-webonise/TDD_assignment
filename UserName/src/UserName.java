
public class UserName {

	boolean validateUserName(String userName)
	{
		String regex= "^[a-zA-Z]{5,}[^\\<>'\"/;`%]*$";
		return userName.matches(regex);
	}
}
