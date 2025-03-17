package com.Practice_prasad;

public class Variables {
	int a = 10; // instance variable
	static int b = 100; // static variable

	public void p1() {
		int d = 50;
		System.out.println(d);
	}

	public static void main(String[] args) {
		//System.out.println(b);
		//Variables obj = new Variables();
		//System.out.println(obj.a);
		//obj.p1();
		Returntype obj=new Returntype();
		int x=obj.multiplication(20, 5);
		System.out.println(Returntype.sub(20, 10, 5));

	}

}
