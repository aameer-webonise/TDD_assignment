
public class StringConcat {
	String ArrayToString(String stringArray[])
	{
		StringBuffer buffer=new StringBuffer();
		for(String text:stringArray)
			buffer.append(text);
		return buffer.toString();
	}
}
