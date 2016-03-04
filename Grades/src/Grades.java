
public class Grades {
	String getGrade(int grade)
	{
		
		return ((grade>=70)?"A":(grade>=60)?"B":(grade>=50)?"C":(grade>=40)?"D":"F");
	}
}
