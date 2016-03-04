
public class Persons {
	int id;
	String name;
	int age;
	String gender;
	Persons(int id,String name,int age,String gender)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public String toString()
	{
		return new String(id+name+age+gender);
	}
}
