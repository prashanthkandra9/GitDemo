package javaLearning;
class Bank
{
	double rateOfInterest()
	{
		return 0;
	}

}
	class SBI extends Bank
	{
		double rateOfInterest()
		{
			return 6.3;
		}
	}
		class ICICI extends Bank
		{
			double rateOfInterest()
			{
				return 7.2;
			}
		}
			class AXIS extends Bank
			{
				double rateOfInterest()
				{
					return 8.1;
				}
			}
	class MethodeOverloading {
	
	public static void main(String[] args)
	{
		AXIS axis=new AXIS();
		System.out.println(axis.rateOfInterest());
		ICICI icici= new ICICI();
		System.out.println(icici.rateOfInterest());
		SBI sbi= new SBI();
		System.out.println(sbi.rateOfInterest());
		
	}
	
}


