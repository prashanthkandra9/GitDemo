package Learning;

public class OverLoading {

		public void getData(int a)
		{
		System.out.println(a);
		}
		
		public void getData(String a)
		{
		System.out.println(a);
		}
		
		public void getData(int a,int b)
		{
		System.out.println(a+b);
		}
		
		public static void main(String[] args) {

		OverLoading ol=new OverLoading();
		
		ol.getData(2);
		ol.getData("hello");
		ol.getData(2, 5);

		}

		}


