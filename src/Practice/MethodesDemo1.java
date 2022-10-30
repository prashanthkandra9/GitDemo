package Practice;

public class MethodesDemo1 {
	
	int m10=100;
	public static int m20=200;
	
 public static void getData()
	{
		System.out.println("I am in Static getData from MethodesDemo1");
	}

 public void getData1()
	{
		System.out.println("I am in getData1 from MethodesDemo1");
	}

 public void getData2()
	{
		System.out.println("I am in getData2 from MethodesDemo1");
	}

	public static void main(String[] args) {
		MethodesDemo1 md1=new MethodesDemo1();
		getData();
		MethodesDemo1.getData();
		
		md1.getData();
		
		MethodesDemo2 md2= new MethodesDemo2();
		//md2.getUserData();
		
		MethodesDemo2.getUserData();
		
		System.out.println("I am accessing using class name:"+ MethodesDemo1.m20);
		
		System.out.println("I am accessing directly:"+ m20);
		System.out.println("I am accessing using Object reference:"+ md1.m20);
		
		//System.out.println("I am accessing Object reference:"+ md1.m10);
		
		System.out.println("I am accessing using class name from another Calss:"+ MethodesDemo2.m3);
		System.out.println("I am accessing using Object reference from anothe class:"+ md2.m3);

		
		// Static methods can be Accesse 3ways from static area(Static method)
		// using Directly//using class name// using object creation
		// if we wanted access static method from the same class, through obeject reference is not recomended
		// if we wanted access static data from the other class we can access using class name
		
		//if we wanted access Non static data from the another class, through the object reference we can access it
		
		// Static member cant be accessed directly from the another class.
		



	}

}
