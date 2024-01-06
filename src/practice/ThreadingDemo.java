package practice;

public class ThreadingDemo extends Thread {
	
	public void run()
	{
		
		try
		{
			System.out.println(Thread.currentThread().getId()+" :is running");
		}
		catch(Exception ex)
		{}
	}

	public static void main(String[] args) {
		int num=8;
		for(int i=0;i<8;i++)
		{
			ThreadingDemo td=new ThreadingDemo();
			td.start();
		}

	}

}
