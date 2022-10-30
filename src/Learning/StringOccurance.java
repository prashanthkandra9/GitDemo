package Learning;

public class StringOccurance {
	
	static String s1="My name is Prasanth";

	public static void main(String[] args) {
		
		String s2=s1.replace("P", "");
		int l1=s1.length();
		int l2=s2.length();
		int occurance=l1-l2;
		System.out.println("A is repeted:"+occurance);

	}

}
