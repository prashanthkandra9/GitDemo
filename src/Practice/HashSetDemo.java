package Practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("UK");
		hs.add("CANADA");
		hs.add("Austrelia");
		hs.add("Swizerland");
		hs.add("Netherland");
		hs.add("USA");
		hs.add("Germany");
		hs.add("Netherland");
			
		System.out.println(hs);
		System.out.println(hs.size());
		//hs.removeAll(hs);
		hs.remove("Germany");
		System.out.println(hs.isEmpty());
		
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
				
//set is iterface and its implements Hashset,linked Hashset,TreeSet
// set does not allowed duplicate values
// Insertion order is not preserved/random order
		

	}

}
