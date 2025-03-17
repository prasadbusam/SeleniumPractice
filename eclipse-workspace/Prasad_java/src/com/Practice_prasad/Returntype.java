package com.Practice_prasad;

public class Returntype {
	public void prasad(String classfirstperson) {
		System.out.println("He is a : " + classfirstperson);
	}

	public void addition(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public int multiplication(int a, int b) {
		int c = a * b;
		System.out.println(c);
		return c;

	}

	public static int sub(int c, int f, int h) {
		int z = c - f - h;
		System.out.println(z);
		return z;
	}

	public int p1() {
		int y = 56;
		System.out.println(y);
		return y;
	}

	public void s1() {
		int d = 30;
		int w = 10;
		int k = d + w;
		System.out.println(k);
	}

	public int u1() {
		int i = 9;
		int o = 8;
		int m = i + o;
		System.out.println(m);
		return m;

	}

	public static void main(String[] args) {
		Returntype obj = new Returntype();
		obj.addition(20, 80);
		obj.prasad("jitendra");
		int x = obj.multiplication(20, 5);
		int v = sub(20, 10, 5);
		int h = obj.p1();
		obj.s1();
		int q = obj.u1();
		

	}

}
