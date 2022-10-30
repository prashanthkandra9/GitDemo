package Learning;

public class AustralianTrafic implements CentralTraffic,ContinentalTraffic
{
	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void greenGo() {
		System.out.println(" Green go implementation");
		
	}

	@Override
	public void redStop() {
		System.out.println(" redstop implementation");
		
	}

	@Override
	public void FlashYellow() {
		System.out.println(" flash yellow implementation");
	}
		
		public void walkonsymbol()
		{
		System.out.println("walking");
		}
		
		public static void main(String[] args) {
			AustralianTrafic at= new AustralianTrafic();
			at.greenGo();
			at.redStop();
			at.FlashYellow();
			at.walkonsymbol();

		}

	}


