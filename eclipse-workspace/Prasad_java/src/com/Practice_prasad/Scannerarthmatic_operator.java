package com.Practice_prasad;

import java.util.Scanner;

public class Scannerarthmatic_operator {

	public static void main(String[] args) {
		int a;
		int b;
		String g;
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		g=obj.next();
		System.out.println("Addition "+(a+b));
		System.out.println("Substraction "+(a-b));
		System.out.println("Multiplication "+(a*b));
		System.out.println("Division "+(a/b));
		System.out.println("Reminder "+(a%b));
		System.out.println("This is "+g);

	}

}
