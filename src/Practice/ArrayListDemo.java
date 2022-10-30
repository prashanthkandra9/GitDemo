package Practice;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList();
		al1.add("Suri");
		al1.add("Koushi");
		al1.add("Lasya");
		al1.add("Abhi");
		
		ArrayList al=new ArrayList();
		al.add("Arunachalashiva");
		al.add("Ravi");
		al.add("Mohan");
		al.add("Suri");
		al.add("Koushi");
		al.add("Lasya");
		al.add("Abhi");
		al.add("Pandu");
		System.out.println(al);
		al.add(1, "Pinkey");
		al.add(2, 234);
		al.add(3, 235);
		al.add(4, 23.00);
		al.add(5, false);
		al.add(6, true);
		
		System.out.println(al);
		System.out.println(al1);
		al.addAll(al1);
		System.out.println("after adding collection:"+ al);
		System.out.println(al.contains("Pandu"));
		System.out.println(al.isEmpty());
		
		//al.remove("Koushi");
		//System.out.println(al.contains("Koushi"));
		//al.remove("Koushi");
		
		System.out.println(al.contains("Koushi"));
		System.out.println(al.get(6));
		System.out.println(al.get(11));
		
		
		System.out.println(al.indexOf("Lasya"));
		//al.removeAll(al1);
		
		System.out.println(al.size());
		//Array list  is heterogeniuos data type
		//Array list is a growable in the nature
		//Array list is index based
		//Array list allows duplicate values
		//Array list contain a in built methode which can be
		//
		
		
		
		
		
			


	}

}
