package Inheritance;
class A
{
	void fun1()
	{
		System.out.println("i am class A fun1");
	}
}
class B extends A
{
	void fun2()
	{
		System.out.println("i am class B fun2");
	}
}
class C extends B
{
	void fun3()
	{
		System.out.println("i am class C fun3");
	}
}

public class D extends C{
	public static void main(String[] args) {
		D obj=new D();
		obj.fun3();
		obj.fun2();
		obj.fun1();
	}

}
