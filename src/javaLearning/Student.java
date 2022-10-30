package javaLearning;

public class Student {
	
	int sid;
	String sName;
	char grade;
		
	Student(int id, String Name, char g)
	{
		sid=id;
		sName=Name;
		grade=g;
	
	}
	
	void getvalues(int id, String Name, char g)
	{
		sid=id;
		sName=Name;
		grade=g;
	
	}
	
	void getdisplay()
	{
		System.out.println(sid+"  "+sName+"  "+grade);
	}
	
	
	public static void main(String[] args) {
	Student s= new Student(999,"ASHIVA",'B');

	/*
	s.sid=100;//assign values by using reference variables
	s.sName="SHIVA";
	s.grade='B';
	*/
//s.getvalues(900, "ARUNACHALASHIVA", 'A');//assign values by using method
s.getdisplay();

	}

}
