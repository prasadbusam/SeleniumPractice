package com.Practice_prasad;

public class Two_dimensional_ayyay {

	public static void main(String[] args) {
		int a[][] = { { 100, 400 }, { 500, 600 }, { 300, 200 } };
		System.out.println("length of rows:" + a.length);
		System.out.println("length of column:" + a[0].length);
		// System.out.println(a[1][1]);
		for (int arr[] : a) {
			for (int y : arr) {
				System.out.print(y+ " ");
			}
			System.out.println();
		}

	}
}
