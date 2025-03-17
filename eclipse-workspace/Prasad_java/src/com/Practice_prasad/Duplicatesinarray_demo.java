package com.Practice_prasad;

public class Duplicatesinarray_demo {

	public static void main(String[] args) {
		int a[] = { 100, 200, 100, 300, 200, 100, 500, 400, 600, 200, 100 };
		int num = 200;
		int count = 0;
		for (int value : a) {
			if (value == num) {
				count++;
			}
		}
		{
			System.out.println(count);
		}
	}

}
