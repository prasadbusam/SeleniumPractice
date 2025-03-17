package Tasks_workouts;

public class Reverse_number {

	public static void main(String[] args) {
		int num=12345;
		int rev=0;
		int r=0;
		
		while(num>0)
		{
			r=num%10;  //last digit 2, 1
			rev=rev*10+r;   //rev 0,3,32, 321
			num=num/10;      //remove the last digit 
		}
		System.out.println(rev);
	}

}
