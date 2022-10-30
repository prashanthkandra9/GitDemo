package Learning;

public class childDemo extends parentDemo {
	
	int a=20;
	public void move() 
	{
		super.move();
		System.out.println(super.a);
		System.out.println("Child class");
			
	}


	public static void main(String[] args) {
		childDemo cd= new childDemo();
		cd.move();
		System.out.println(cd.a);
	


	}

}
