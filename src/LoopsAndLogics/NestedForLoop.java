package LoopsAndLogics;

public class NestedForLoop {

	public static void main(String[] args) {
		int k=1;
		
		for(int i=0;i<=4;i++)
		{
			//System.out.println("****Outer for Loop******"+ i);
			
			//System.out.println(i);
			for(int j=1;j<=4-i;j++)
			{
				//System.out.println("Inner for Loop"+ j);
				//System.out.print(j);
				
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
		System.out.println( "");
		}



	}

}

/*
1	2	3	4	
5	6	7	
8	9	
10	


*/