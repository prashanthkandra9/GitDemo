package Practice;

public class ArryDemo {

	public static void main(String[] args) {
		int a[]=new int[5];	
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int b[]= {200,300,400,700,100,300,4000};
		
		String c[]= {"234","Shiva","Ram","Venkat","Durga","bhavani","Amma","Vinayaka","Arunachalshiva","Narayana"};
		
		
		System.out.println(c[3]);
		System.out.println(c[6]);
		System.out.println(c[8]);
		//Durga,Vinayaka, Narayana
		System.out.println(c.length);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}	

	}

}

//Array' are index based'
//Array's are fixed lenth'
//Aray's are homogenous data types
//Arry's does not have any inbuilt methodes'
// error-Type mismatch: cannot convert from String to int
//int b[]= {200,300,400,700,100,300,4000, "sam"};
