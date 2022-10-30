package LoopsAndLogics;

public class CountUpperLower {
	
	public static void main(String[] args) {
	      String str1 = "Kandra Prasanth BAbu";
	      int upperCase = 0;
	      int lowerCase = 0;
	      
	      for(int i=0;i<=str1.length()-1;i++) {
	         if(str1.charAt(i) >='A' && str1.charAt(i) <='Z') {
	            upperCase++;
	         } else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
	            lowerCase++;
	 
	         }
	      }
	      System.out.println("Count of Uppercase letter/s is/are " + upperCase);
	    		  System.out.println( "count of Lowercase letter/s is/are " + lowerCase);
	   }
	}


