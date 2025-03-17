package Tasks_workouts;

public class Breakloop_num_is_even {

	public static void main(String[] args) {
		int []i= {1,3,5,7,9,4,11,13};
		for (int b:i)
		{
			if(b%2==0)
			{
				System.out.println("even number found:"+b);
				break;
			}
			System.out.println("checking numbers:"+b);
		}
			
		}
}


