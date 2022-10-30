package Practice;

public class MinNumberFromArry {

	public static void main(String[] args) {
	
		int a[][]= {{4,24,7},{6,10,2},{9,1,8}};
		
		int min=4;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(min>a[i][j])
				{
					min=a[i][j];
				}
			}
		}
		
		System.out.println(min);

	}

}
