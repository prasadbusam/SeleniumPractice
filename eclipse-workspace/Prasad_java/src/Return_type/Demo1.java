package Return_type;

/*public class Demo1 {
	public void ram(int a, int b) {
		if(a>b) {
			System.out.println("print a");
		}else {
			System.out.println("print b");
		}
		public int cal() {
			int a=10;
			int b=12;
			int c=a+b;
			return c;
		}
	}

	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		obj.ram(20, 40);
		obj.

	}*/

public class Demo1 {
    public void ram(int a, int b) {
        if(a > b) {
            System.out.println("print a");
        } else {
            System.out.println("print b");
        }
    }

    public int cal() {
        int a = 10;
        int b = 12;
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.ram(20, 40);
        int y=obj.cal();
        System.out.println(y);
    }
}

