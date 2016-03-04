
public class Calculator {

	//add two integers
	int add(int num1,int num2)
	{
		return num1+num2;
	}
	
	//add two doubles
	double add(double num1,double num2)
	{
		return num1+num2;
	}
	
	//substract two integers
	int sub(int num1,int num2)
	{
		return num1-num2;
	}
	
	//substract two doubles
	double sub(double num1,double num2)
	{
		return num1-num2;
	}
	
	
	//multiply two integers
	int mul(int num1,int num2)
	{
		return num1*num2;
	}
	
	//multiply two doubles
	double mul(double num1,double num2)
	{
		return num1*num2;
	}
	
	//divide two integers
	int div(int num1,int num2) throws IllegalArgumentException
	{
		if(num2==0) throw new IllegalArgumentException("cant divide a number by zero");
		return num1/num2;
	}
	
	//divide two doubles
	double div(double num1,double num2) throws IllegalArgumentException
	{
		if(num2==0) throw new IllegalArgumentException("cant divide a number by zero");
		return num1/num2;
	}
	
}
