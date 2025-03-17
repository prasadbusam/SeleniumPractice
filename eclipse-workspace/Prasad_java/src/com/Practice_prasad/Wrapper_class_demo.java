package com.Practice_prasad;

public class Wrapper_class_demo {

	public static void main(String[] args) {
		//string to int
		/*String s1="100";
		String s2="200";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));*/
		
		//string to double
		//String s1="100.8";
		//String s2="200.5";
		//System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		
		//string to boolean
		/*String s="true";
		System.out.println(Boolean.parseBoolean(s));
		
		String s1="prasad";
		System.out.println(Boolean.parseBoolean(s1));
		
		String s2="false";
		System.out.println(Boolean.parseBoolean(s2));*/
		
		//Anydata type to string
		int a=10;
		double d=10.7;
		char c='A';
		boolean bool=true;
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(bool));

	}

}
