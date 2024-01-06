package practice;

public class StaticDemo {
	static int id;
	int mark;
	static String schoolName;
	static
	{
		id=101;
		//mark=123;to initialize static variables
		schoolName="sacred Herts";
	}
	public static void main(String[] args) {
		StaticDemo sd=new StaticDemo();
		sd.mark=23;
		
		System.out.println(id);
		System.out.println(sd.id);
		System.out.println(StaticDemo.id);
		System.out.println(sd.mark);
	}

}
