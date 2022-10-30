package coverJavaInterview;

public class SumofElements {

	//Create a Method which accepts Array and returns sum of all the elements in array 
	public static void main(String[] args) {

		int[] a = { 1,2,3,4,5};
		int sum= sumArray(a);
		System.out.println(sum);
		
	}
	public static int sumArray(int[] a)
	{
		int sum =0;
		//extract every value of array and sum each value with other
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			sum = sum + a[i];  //10			
		}
		
		return sum;
		
	}

	
}



