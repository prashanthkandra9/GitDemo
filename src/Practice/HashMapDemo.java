package Practice;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put(10, "UK");
		hm.put(20, "CANADA");
		hm.put(30, "Netherland");
		hm.put(40, "Dubai");
		hm.put(50, "UAE");
		hm.put(60, "CANADA");
		hm.put(60, "CANADA");//duplicate
		hm.put(70, "CANADA");
		hm.put(null, "SWIS");//Null key
		hm.put(null, "Germany");
		hm.put(80, null);
		hm.put(90, null);
		hm.put(100, null);
		
		System.out.println(hm);
		
		//System.out.println(hm.clone());
		
		//hm.remove(10);
		hm.replace(100, "SCOTTLAND");
		System.out.println(hm.isEmpty());
	
		System.out.println(hm.size());
		System.out.println(hm.get(null));
		hm.containsValue("UK");
		
		// if we want represent data with Key value pair then will go for Hash Map
		// it will not allowed duplicate Key's
		//it will allow the duplicate values
		// Null key is allowed once
		//Null Values are repeated mutiples
		//Insertion order is not preserved
		
		

	}

}
