package javaLearning;

public class MethodOverloading {
	
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a,double b)
	{
		System.out.println(a+b);
	}

	void sum(int a,int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		MethodOverloading mo= new MethodOverloading();
		mo.sum(10, 80);
		mo.sum(30, 30.3);
		mo.sum(90, 90, 90);
		

	}

}
