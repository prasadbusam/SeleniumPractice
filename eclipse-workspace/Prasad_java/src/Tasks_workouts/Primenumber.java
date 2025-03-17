package Tasks_workouts;

public class Primenumber {

	public static void main(String[] args) {
		
		int c=0;
		for(int a=1;a<=50;a++)
		{
			for(int j=1;j<a;j++)
			{
				if(a%j==0) {
					c++;
				}
			}
				
				if (c==1)
				{
					System.out.println("prime"+a);
				}
				else 
				{
					System.out.println("not prime"+a);
				}
				c=0;
				
			}
		
	}
	}

//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
