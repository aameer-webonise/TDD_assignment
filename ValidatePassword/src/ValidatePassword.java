import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidatePassword {
	String ignoreSpecial = "_,.,-";
	private Pattern expression =Pattern.compile("^[a-zA-Z0-9]{8,}[/,.~`|-]+$");
	public boolean isPasswordValid(String password)
	{
		
		Matcher passwordMatcher =expression.matcher(password);
		return (passwordMatcher.matches()?true:false);
	}
}
