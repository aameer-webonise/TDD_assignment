import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateIFSC {

	private Pattern IFSCCodePattern=Pattern.compile("^[A-Z|a-z]{4}[0][0-9]{6}$");
	public boolean isIFSCCodeValid(String ifscCode)
	{
		Matcher ifscMatcher =IFSCCodePattern.matcher(ifscCode);
		return (ifscMatcher.matches()?true:false);
	}

}
