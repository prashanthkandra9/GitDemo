package Learning;

public class Hero extends Bike {
	
	void run() {
		System.out.println("Hero motors");
		
	}

	@Override
	void milage() {
		System.out.println("Hero motors milage is 60");
		
	}

	@Override
	void cc() {
		System.out.println("Hero motors cc is 100");
		
	}
	
	@Override
	void model() {
		System.out.println("Hero Glamour");
		
	}

	public static void main(String[] args) {
		
		Hero h= new Hero();
		h.run();
		h.milage();
		h.cc();h.model();
		
	}

	
	
	
}
