package Practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccuranceOfStr {

	static void countcharacters(String name){
	      HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	      char[] strarray = name.toCharArray();
	      for (char c : strarray){
	         if (hm.containsKey(c)){
	            hm.put(c, hm.get(c) + 1);
	         }else{
	            hm.put(c, 1);
	         }
	      }
	      
	     /*
	      for (Entry<Character, Integer> entry : hm.entrySet())
	      {
	         System.out.println(entry.getKey() + " " + entry.getValue());
	      }
	      */
	      
	     System.out.println(name + " " + hm);
	   }
	   public static void main(String[] args){
	      //String my_str = "Joe Erien ";
	      System.out.println("The occurence of every character in the string is ");
	      countcharacters("Joe Erien");
	      countcharacters("Welcome to Sony");
	      countcharacters("   Anunachala shiva");
	      
	      
	   }
	}

