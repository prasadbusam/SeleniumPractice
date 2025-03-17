package Accessmodifiers;

public class ClassA {

public int pub=10;
private int pri=20;
protected int pro=30;
int def=40;
void printdata()
{
	System.out.println(pub);
	System.out.println(pri);
	System.out.println(pro);
	System.out.println(def);
}

private void printprivate()
{
	System.out.println("hello world");
}
	public static void main(String[] args) {
		ClassA obj=new ClassA();
		obj.pub=100;
		obj.def=20;
		obj.pro=40;
		obj.printprivate();
		obj.pri=50;

	}

}
