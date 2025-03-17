package Final_keywords;

class A
{
	int a=10;
	public void getdata(int a) {
		a=a;
		a=20;
		this.a=40;
		System.out.println(a);
	}
	public void printdata() {
		this.a=220;
		System.out.println(a);
	}
}

public class Practice1 {

	public static void main(String[] args) {
		A obj=new A();
		System.out.println(obj.a);
		obj.getdata(30);
		obj.printdata();

	}

}
