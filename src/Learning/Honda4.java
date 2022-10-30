package Learning;

	public class Honda4 extends Bike{ 
		
	void run()
	{
		System.out.println("running safely");
		}  
	@Override
	void milage() {
		System.out.println("Honda milage is 45");
		
	}
	@Override
	void cc() {
		System.out.println("Hond cc is 99");
		
	}  
	
	@Override
	void model() {
		System.out.println("Hond Shine");
		
	}
	
	public static void main(String args[]){  
	 Bike obj = new Honda4();  
	 obj.run();  
	 obj.milage();
	 obj.cc();
	 obj.model();
	 
	 //Bike b= new Bike();
	}
	
	
	} 



