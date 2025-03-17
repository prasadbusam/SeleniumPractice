package Another;

public class Cal {
private int num1, num2;
//int num2;
public int res;
protected int d;
int f;

public void div(int a, int b)
{
	if(b==0)
	{
		System.out.println("Div not possible");
	}
	else
	{
		num1=a;
		num2=b;
		System.out.println(num1/num2);
	}
}



}
