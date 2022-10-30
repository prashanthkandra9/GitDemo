package javaLearning;

public class ThisKeyword {
		
	int a;
	int b;  //instance variable name and local variable name is same
	void getvalues(int a, int b)// local variable
	{
		this.a=a;
		this.b=b;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword th= new ThisKeyword();
		th.getvalues(10, 20);
		th.display();
				
		

	}

}
