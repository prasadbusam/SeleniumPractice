package com.Practice_prasad;

import java.util.Scanner;

public class Scanner_Relationaloperator {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.println("True/false "+(a>b));
		System.out.println("True/fales "+(a<b));
		System.out.println("True/fales "+(a>=b));
		System.out.println("True/fales "+(a<=b));
		System.out.println("True/fales "+(a==b));
		System.out.println("True/fales "+(a!=b));
		

	}

}
