package Accessmodifiers;

public class ClassB extends ClassA {
	void print()
	{
		System.out.println(pub);
		System.out.println(def);
		System.out.println(pro);
		//System.out.println(pri);
	}

	/*public static void main(String[] args) {
		ClassA obj1=new ClassA();
		obj1.pub=40;
		obj1.pro=30;
		obj1.def=20;
		

	}*/

}
