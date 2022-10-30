package Practice;

public interface CentralTraffic {
	
   static int a=9;
	public abstract void greenGO();
	
	void flashYellow();
	void redStop();
	

}

//private int a=9;
//Illegal modifier for the interface field CentralTraffic.a; only public, static & final are permitted

/*
public abstract void greenGO() // Error: Abstract methods do not specify a body
	{
		
	}

*/