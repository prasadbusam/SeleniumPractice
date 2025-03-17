package Another;

import Accessmodifiers.ClassA;

public class ClassC extends ClassA{
	public void print() {
		System.out.println(pub);
		//System.out.println(def);
		//System.out.println(pri);
		System.out.println(pro);
	}

	public static void main(String[] args) {
		ClassA obj1=new ClassA();
		obj1.pub=20;
		//obj1.pro=90;
	

	}

}
