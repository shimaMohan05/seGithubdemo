package practice;

public class DemoClass {
	int i=90;
	public void show()
	{
		i=100;
	
	}

	public static void main(String[] args) {
		DemoClass ob=new DemoClass();
		System.out.println(ob.i);
		ob.show();
		System.out.println(ob.i);
		DemoClass ob1=new DemoClass();
		System.out.println(ob1.i);

	}

}
