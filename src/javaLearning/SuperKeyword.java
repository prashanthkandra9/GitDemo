package javaLearning;

class Parent
{
	int a=20;
	
}

class Child extends Parent
{
	int a=10;
			
void print()
{
			
System.out.println(a);
System.out.println(super.a);
}
}

public class SuperKeyword {

	public static void main(String[] args) {
	
	Child c=new Child();
	c.print();
	}
}
