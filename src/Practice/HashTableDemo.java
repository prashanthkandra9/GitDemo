package Practice;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable ht= new Hashtable();
		
		ht.put(10, "UK");
		ht.put(20, "CANADA");
		ht.put(30, "Netherland");
		ht.put(40, "Dubai");
		ht.put(50, "UAE");
		ht.put(50, "UAE11");
		ht.put(60, "CANADA");
		ht.put(60, "CANADA");//duplicate
		ht.put(70, "CANADA");
		//ht.put(80, null);
		//ht.put(null, "Germany");//Exception in thread "main" java.lang.NullPointerException
		
		System.out.println(ht);
		
	
		// if we want represent data with Key value pair then will go for Hash Map
		// it will not allowed duplicate Key's
		//it will allow the duplicate values
		// Null key is Not allowed: if we try to use it the we will get NullpointerException
		//Null Values are Not allowed: if we try to use it the we will get NullpointerException
		//Insertion order is not preserved
		
		

	}

}



