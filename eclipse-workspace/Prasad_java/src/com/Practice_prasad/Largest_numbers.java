package com.Practice_prasad;

public class Largest_numbers {

	public static void main(String[] args) {
		int a=10, b=20, c=50;
		if (a>b && b>c) {
			System.out.println("A is a largest number");
		}
		else if (b>a && b>c) {
			System.out.println("B is a largest number");
		}
		else if(c>a && c>b) {
			System.out.println("C is a largest number");
		}
		else {
			System.out.println("The above statement false");
		}

	}

}
