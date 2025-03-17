package com.Practice_prasad;

public class Vote_elseif_condition {

	public static void main(String[] args) {
		int age=19;
		if(age<=18) {
			System.out.println("Not eligible for vote");
		}
		else if(age==19) {
			System.out.println("Time has gone Apply next time");
		}
		else if(age>=19) {
			System.out.println("This is correct age to cast vote");
		}

	}

}
