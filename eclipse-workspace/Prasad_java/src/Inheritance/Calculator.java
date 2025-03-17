package Inheritance;

public class Calculator {
	int a,b;
	int res;
	void add(int num1, int num2) {
		a=num1;
		b=num2;
		res=a+b;
		System.out.println("Addition of numbers :" +res);
	}
	void sub(int num1, int num2) {
		a=num1;
		b=num2;
		res=a-b;
		System.out.println("Addition of numbers"+res);
	}
	void multi(int num1, int num2) {
		a=num1;
		b=num2;
		res=a*b;
		System.out.println("Addition of numbers"+res);
	}
	void div(int num1, int num2) {
		a=num1;
		b=num2;
		res=a/b;
		System.out.println("Addition of numbers"+res);
	}
	//public static void main(String[] args) {
		
		//Calculator obj=new Calculator();
		
	//}

}
