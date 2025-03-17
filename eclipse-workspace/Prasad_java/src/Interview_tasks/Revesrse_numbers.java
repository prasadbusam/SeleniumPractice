package Interview_tasks;

import java.util.Scanner;

public class Revesrse_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		 int num=sc.nextInt(); //1234
		 /*int rev=0;
		 while(num!=0)
		 {
			 rev=rev*10 + num%10;
			 num=num/10;
		 }
		 System.out.println("Reverse number is :"+rev);*/
		 
		 StringBuilder sbl=new StringBuilder();
		 sbl.append(num);
		 StringBuilder rev=sbl.reverse();
		 System.out.println("Reverse number is :"+rev);
		 

	}

}
