package myStuffs;


public class SpawnThread
{
	//implementing Thread by extending Thread class
	public static class MyThread extends Thread
	{       

		public void run()
		{
			try
			{
      			System.out.println(" Thread Running " + Thread.currentThread().getName());
      			Thread.sleep(1000);
      		}
      		catch (InterruptedException e)
      		{
      			Thread.currentThread().interrupt();
      		}
      		
		}
	}

	//implementing Thread by implementing Runnable interface
	public static class MyRunnable implements Runnable{         

	    public void run()
	    {
	       System.out.println(" Create Thread " + Thread.currentThread().getName());
	       for(;;);
	    }

	 }

	 public static void main(String[] args) 
	 {
		 	//starting Thread in Java
		Thread mythread = new MyThread(); //Thread created not started
		mythread.setName("T1");
		Thread myrunnable = new Thread(new MyRunnable(),"T2"); //Thread created       

		mythread.start(); //Thread started now but not running 
		myrunnable.start();
	}
}
