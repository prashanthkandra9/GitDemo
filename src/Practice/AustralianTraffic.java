package Practice;

public class AustralianTraffic implements CentralTraffic, ContenantalTraffic{

	@Override
	public void greenGO() {
		System.out.println("Grean Go");
		
	}

	@Override
	public void flashYellow() {
		System.out.println("YellowFlash");
		
	}

	@Override
	public void redStop() {
		
		System.out.println("RedStop");
		
	}
	
	
	@Override
	public void trainSymble() {
		System.out.println("walking");
		
	}

	public static void main(String[] args) {
		AustralianTraffic at= new AustralianTraffic();
		CentralTraffic ct= new AustralianTraffic();
		

		
		//CentralTraffic ct= new CentralTraffic(); Error: Cannot instantiate the type CentralTraffic
		
		ct.flashYellow();
		at.greenGO();
		at.flashYellow();
		at.redStop();
		System.out.println(ct.a);
		System.out.println(at.a);
		at.trainSymble();
		
		
		
	}



}
