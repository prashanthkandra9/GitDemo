package coverJavaInterview;
import java.util.ArrayList;

public class CompareArray {
	//compare same indexes of 2 different arrays and create another array for matching values
	public static void main(String[] args) {
		int a[]  = { 1,4,5,7};
		int b[]= {6,4,3,7}; 	// {4,7}
		//int[] ab =new int[4];
		ArrayList<Integer>al =new ArrayList<Integer>();

		for(int i=0;i<a.length;i++)
		{
			if(a[i] ==b[i])
			{
				//code to create another array
				al.add(a[i]);
			}
		}
		Object[] c=al.toArray();

		for(Object obj :  c)
		{
			System.out.println(obj);
		}

	}

}

//1) take 2 array's a, b
//2) we need take one Arraylist
//3) we need right normal for loop
//4) using if condition compare a[i]==b[i]
//5) if step-4 true then add the element to the array list al.add[i]
//6) convert arraylist to array Object[] c	=al.toArray();
//7) use for each loop and print the array values for(Object obj :c)