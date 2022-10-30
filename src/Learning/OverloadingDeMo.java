package Learning;

public class OverloadingDeMo {
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void getData(String s)
	{
		System.out.println(s);
	}
	public void getData(double d)
	{
		System.out.println(d);
	}
	
	
	public static void main(String args[])
	{
		OverloadingDeMo od= new OverloadingDeMo();
		od.getData(10);
		od.getData(30.0);
		od.getData("ARUNACHALA SHIVA");
		od.getData(30, 60);
	}
	

}
