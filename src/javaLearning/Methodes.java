package javaLearning;

public class Methodes {
	int a=10;
	int b=20;
	
	
	//method without parameter and without return type
	/*void sum()
	{
		System.out.println(a+b);
	}
*/
	//method without parameter and with return type
	int sum()
	{
		return (a+b);
	}
	
	
	//method with parameter and without return type
		/*void sum(int a, int b)
		{
			System.out.println(a+b);
		}
		*/
	
		//method with parameter and with return type
			 int sum(int a, int b)
				{
					return(a+b);
				}
	public static void main(String[] args) {

		
		Methodes md=new Methodes();
		//md.sum();
		//System.out.println(md.sum());
		//md.sum(20, 70);
		System.out.println(md.sum(300, 600));
		

	}

}
