package Practice;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int a[]= {20,10,40,58,48,99,90,33,49,76};
		
		Arrays.sort(a);
		Arrays.toString(a);
		System.out.println("Sorted Array:"+a);		
		int sh= (a.length);
		//int res=a[sh-2];
		
		
		System.out.println("Second larhest number is:"+ a[sh-2]);
		
		
		
		

	}

}
