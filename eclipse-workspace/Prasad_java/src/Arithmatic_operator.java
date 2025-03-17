import java.util.Scanner;

public class Arithmatic_operator {

	public static void main(String[] args) {
		int a;
		int b;
		System.out.println("Enter value");
		Scanner sc=new Scanner(System.in);  //system.in (to take the data from the console 
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition :"+(a+b));
		System.out.println("Addition :"+(a-b));
		System.out.println("Addition :"+(a*b));
		System.out.println("Addition :"+(a/b));
		System.out.println("Addition :"+(a%b));

	}

}
