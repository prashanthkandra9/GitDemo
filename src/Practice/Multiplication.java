package Practice;

public class Multiplication {

	public static int multiply(int i, int j)
	{
		int k=1;
		int sum=0;
		while(k<=j)
		{
			sum = sum + i;//
			k++;

		}

		return sum;
	}

	public static void main(String[] args) {
		int res=multiply(5,11);
		System.out.println(res);


	}

}
