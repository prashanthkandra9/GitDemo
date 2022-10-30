package Practice;

public class SumArry
{
	public static void main(String[] args) {
		
		int[] a= {1,4,5,6,3,6,7,8,10};
		int sum=sumArray(a);
		System.out.println(sum);
	}	
	public static int sumArray(int[] a) {
		 int sum=0;
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			
			sum= sum+a[i];
		}
		return sum;	
	
	}
	

}

