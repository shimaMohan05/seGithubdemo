package week1;

public class Employee {
	int empid;
	String empName;
	
	public void display()
	{
		System.out.println("Employee id is: "+empid);
		System.out.println("Employee name is: "+empName);
	}
	
	public static void main(String[] args) {
		String s1="100";
		System.out.println(s1+100);
		System.out.println(Integer.parseInt(s1));
		int j=200;
		String s2=String.valueOf(j);
		System.out.println(s2);
		Employee e1=new Employee();
		e1.empid=101;
		e1.empName="Rahul";
		e1.display();
		Employee e2=new Employee();
		e2.empid=102;
		e2.empName="Mohan";
		e2.display();
		Employee e3=new Employee();
		e3.empid=103;
		e3.empName="Rohan";
		e3.display();
		Employee e4=new Employee();
		e4.empid=104;
		e4.empName="Yohan";
		e4.display();
		Employee e5=new Employee();
		e5.empid=105;
		e5.empName="Gokul";
		e5.display();

	}

}
