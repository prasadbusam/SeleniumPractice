package inheritance2;

class A {
	int a;
	void printmyname(String name)
	{
		System.out.println(name);
	}

}
class B {
	int id;
	void printvalueofId(String course, int id)
	{
		this.id=id;// this keyword is used to represent instance variable
		System.out.println(course +" "+id);// local variable
	}
	void printvalueofId()
	{
		System.out.println(id);
	}

}

public class inhe2{
	public static void main(String[] args) {
		B obj=new B();
		obj.printvalueofId("Testing",100);
		obj.printvalueofId();
		
				
	}
}

