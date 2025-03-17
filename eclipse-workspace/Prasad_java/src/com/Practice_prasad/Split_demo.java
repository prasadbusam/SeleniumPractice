package com.Practice_prasad;

public class Split_demo {

	public static void main(String[] args) {
		String str="This is prasad frm QT";
		String [] data=str.split(" ");
		for(String note:data) {
			System.out.println(note);
			
			char[] demo=str.toCharArray();
			for(char note1:demo) {
				System.out.println(note1);
				System.out.println(str.charAt(3));
				System.out.println(str.indexOf("p"));
			}
		}

	}

}
