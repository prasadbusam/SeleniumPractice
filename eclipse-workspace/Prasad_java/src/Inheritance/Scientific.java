package Inheritance;

public class Scientific {
	
	void power(int a, int b)
	{
		System.out.println(Math.pow(a, b));
	}

	public static void main(String[] args) {
		Scientific obj=new Scientific();
		Calculator obj1=new Calculator();
		obj1.add(9, 10);
		//obj.add(6,4);
		//obj.power(2,9);

	}

}
