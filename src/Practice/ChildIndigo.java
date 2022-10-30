package Practice;

public class ChildIndigo extends AircraftBody{
	
	
	@Override
	void aircraftColor() {
		System.out.println("Aircarft Color is white");
		
	}

	@Override
	void aircraftLogo() {
		System.out.println("Aircarft  Logo");
		
	}

	
	public void aircraftModel() {
		System.out.println("Aircarft Model is INDIGO 9999");
		
	}

	public static void main(String[] args) {
		
		AircraftBody ab= new ChildIndigo();
		
		
		ab.aircraftColor();
		ab.aircraftLogo();
		ab.aircrapftengine();
		ab.aircraftSaftGuide();
		
		ChildIndigo ci= new ChildIndigo();
		ci.aircraftModel();
		
		

	}



	
}
