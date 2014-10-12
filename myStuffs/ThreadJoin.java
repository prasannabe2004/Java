package myStuffs;


public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException
	{
		JoinThread t1 = new JoinThread("one");
		JoinThread t2 = new JoinThread("two");
		t1.start();
		t1.join();
		t2.start();
	}

	static class JoinThread extends Thread {
		public JoinThread( String name) {
			super(name);
		}

		public void run() {
			for (int i =0; i<5;i++) {
				System.out.println(getName());
			}
		}
	}
}
