package com.Practice_prasad;

public class Switch_condition {

	public static void main(String[] args) {
		int weekno=1;
		switch (weekno) {
		case 1: System.out.println("sunday");break;
		case 2: System.out.println("monday");break;
		case 3: System.out.println("tuesday");break;
		case 4: System.out.println("wednseday");break;
		case 5: System.out.println("thursday");break;
		case 6: System.out.println("friday");break;

		default:
			System.out.println("invalid week number");
		}

	}

}
