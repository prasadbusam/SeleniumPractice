package com.Practice_prasad;

public class Constructorone {
	public Constructorone() {
		int a = 20;
		int b = 10;
		int c = a + b;

		System.out.println(c);
	}

	public Constructorone(int d, int e) {
		System.out.println(d);
		System.out.println(e);
	}

	public Constructorone(int g, String h) {
		System.out.println(g);
		System.out.println("This is:" + h);

	}

	public static void main(String[] args) {
		Constructorone obj = new Constructorone(10, 30);
		Constructorone obj1 = new Constructorone();
		Constructorone obj2 = new Constructorone(40, "jitendra");

	}

}
