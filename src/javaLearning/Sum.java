package javaLearning;

public class Sum {
	
	Sum(int a, int b)
	{
	System.out.println(a+b);
	}
	
	Sum(int a, double b)
	{
	System.out.println(a+b);
	}
	Sum(int a, int b, int c)
	{
		System.out.println(a+b+c);	
	}
	

	public static void main(String[] args) {
		Sum s= new Sum(10, 80);
		Sum s1= new Sum(10,20,40);
		Sum s2= new Sum(10,20.9);
		
	
	}

}
