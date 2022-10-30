package OverRiding;

public class TestBank  {

	public static void main(String[] args) {
		AXIS axis= new AXIS();
		System.out.println(axis.getRateOfInterest());
		SBI sbi=new SBI();
		System.out.println(sbi.getRateOfInterest());
		
		ICICI icici=new ICICI();
		System.out.println(icici.getRateOfInterest());

	}

}
