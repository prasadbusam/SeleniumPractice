package Class_concepts;

import java.sql.DatabaseMetaData;

public class Emp_object {

	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		emp.name="prasad";
		emp1.salary=1000;
		emp1.salary=1200;
		emp2.height=167.89f;
		emp3.sam=450.6789;
		System.out.println(emp.name);
		System.out.println(emp1.salary);
		System.out.println(emp1.salary);
		System.out.println(emp2.height);
		System.out.println(emp3.sam);
		Employee.inc=30;
		Employee.inc=80;
		System.out.println(Employee.inc);
		System.out.println(Employee.inc);
		
	
		
		

	}

	private static void data() {
		// TODO Auto-generated method stub
		
	}

}
