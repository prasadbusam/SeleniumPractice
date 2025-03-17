package Polymorphism;

public class Basic_concept {
	
	void add(int a, int b)   //Static polymorphism (Compile time Polymorphism)
	{
		System.out.println(a+b);
	}
	void add1(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	int add2(String s1, String s2)
	{
		//System.out.println(s1+s2);
		return 4;
	}
	public static void main(String[] args) {
		Basic_concept obj=new Basic_concept();
		//obj.add(10, 20);
		//obj.add1(1, 2, 4);
		//obj.add2("prasad", "zabbar");
		System.out.println(obj.add2("12", "10"));

	}

}
