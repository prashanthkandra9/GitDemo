package Practice;

public class StringDemo {

	public static void main(String[] args) {
		
//String object creating using new key word
// string object we can creating using string litrell
//String litr: if we create multiple strings with same values, it will be reafer to only one object
		
  String s=new String("Welcome");
  String s1=new String("Welcome");
  
  String s4="Prasanth";
  String s5="Prashant";
  
  String s6="Prashanth babu kandra";
 /* 
  for(int i=s6.length()-1;i>=0;i--)
  {
	 System.out.println(s6.charAt(i));
  }
  
 */
 String[] s7= s6.split("babu");
 
 System.out.println(s7[0]);
 System.out.println(s7[1]);
 //System.out.println(s7[2]);
 System.out.println(s7[1].trim());
 
 System.out.println(s6.length());
	}

}
