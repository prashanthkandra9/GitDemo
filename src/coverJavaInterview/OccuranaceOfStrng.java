package coverJavaInterview;

import java.util.HashMap;

public class OccuranaceOfStrng {

	public static void stroccur(String name)
	{
		HashMap<Character, Integer> hm= new HashMap<Character,Integer>();
		char[] StrArray =name.toCharArray();
		for(char c:StrArray)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(name+" "+ hm);			
	}
	public static void main(String[] args) {
		stroccur("Welcome to shiva");
		stroccur("   Welcome to shiva");
		stroccur("javajava java Selenium selenium");
		

	}

}
//1) we need pass name through the methode
//2) we need take HashMapCharacter, Integer>
//3) we need covert name anto char array  char[] StrArray =name.toCharArray()
//4) we need take for each loop and display values from the StrArray
//5) using if condition will check if the value already aviable in the hm