

public class DeadLockFix
{
	static public void method1()
	{
		synchronized(Integer.class)
		{
			System.out.println("Aquired lock on Integer.class object");
			synchronized (String.class) 
			{
				System.out.println("Aquired lock on String.class object");
			}
		}
	}

	static class ThreadOne implements Runnable 
	{
		public void run()
		{
			method1();
		}

	}
	static public void method2()
	{
		synchronized(Integer.class)
		{
			System.out.println("Aquired lock on Integer.class object");
			synchronized (String.class) 
			{
				System.out.println("Aquired lock on String.class object");
			}
		}
	}

	static class ThreadTwo implements Runnable 
	{
		public void run()
		{
			method2();
		}

	}
	public static void main(String[] args)
	{
		new Thread(new ThreadOne(), "ThreadOne").start();
		new Thread(new ThreadTwo(), "ThreadTwo").start();
	}

}
