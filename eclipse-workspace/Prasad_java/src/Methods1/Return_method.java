package Methods1;



public class Return_method {
	
	int multi(int a,int b)
	{
		int c=a*b;
		return c;
	}

	public static void main(String[] args) {
		Return_method obj=new Return_method();
		int z=obj.multi(2, 7);
		System.out.println(z);

	}

}
