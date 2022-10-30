package Practice;

public class MultiDimenArray {

	public static void main(String[] args) {
		
		int a[][]= new int[3][3];
		
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=6;
		
		a[1][0]=6;
		a[1][1]=8;
		a[1][2]=9;
		
		a[2][0]=7;
		a[2][1]=3;
		a[2][2]=5;
		
		int b[][]= {{2,4,6},{6,8,9},{7,3,5}};
		
		String c[][]= {{"ram","Shyam","shiv"},{"ravi","venu","shiv"},{"chinna","lasya","shiv"}};
					
		
		
		System.out.println("C arry lenghth:"+ c.length);
		
		//System.out.println(c[2][1]);
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				System.out.println(c[i][j]);
			}
		}
		
		
	
		
/*
		
		//System.out.println(a[0][2]);
		
		//System.out.println(a[1][0]);
		try {
			System.out.println(a[3][0]);
		}
		catch(Exception e)
		{
		System.out.println("Catch the exception:"+ e.getMessage());	
		}
		
		finally
		{
			System.out.println("Final block executed");	
		}
		
		System.out.println(a.length);

		//9,1,3, 
		
			
*/
	}

}


//0 1 2
//2 4 6 0
//8 9 7 1
//3 1 5 2

