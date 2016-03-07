import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidatePassword {
	private Pattern expression =Pattern.compile("^([a-zA-Z0-9]*[_!-.@#$%^&\\s]+[a-zA-Z0-9]*)+$");
	public boolean isPasswordValid(String password)
	{
		if(password.length()==8)
		{
		Matcher passwordMatcher =expression.matcher(password);
		return (passwordMatcher.matches()?true:false);
		}
		return false;
	}
}
