package Learning;
import java.util.ArrayList;

public class CompareArray {
	public static void main(String[] args) {
		{
			int[] a={3,4,7,8,2};
			int[] b={6,4,9,8,1};
			ArrayList<Integer> al=new ArrayList<Integer>();
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
				{
					al.add(a[i]);
				}	
			}
			System.out.println(al);
			Object[] c	=al.toArray();
			for(Object obj :c)
			{
				System.out.println(obj);
			}
		}

	}

}
// 1) take 2 array's a, b
 //2) we need take one Arraylist
//3) we need right normal for loop
//4) using if condition compare a[i]==b[i]
//5) if step-4 true then add the element to the array list al.add[i]
//6) convert arraylist to array Object[] c	=al.toArray();
//7) use for each loop and print the array values for(Object obj :c)