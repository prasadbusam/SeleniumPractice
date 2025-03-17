package Loops;

public class For_loop_demo {

	public static void main(String[] args) {
		/*for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}*/
		/*for(int i=2;i<=10;i+=2)
		{
			System.out.println(i);
		}*/
		for (int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even numbers :"+i);
			}
			else
			{
				System.out.println("Odd numbers :"+i);
			}
		}

	}

}
