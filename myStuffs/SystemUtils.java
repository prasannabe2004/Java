package myStuffs;

public class SystemUtils {
  
  private SystemUtils() {}
  
  public static String getPID() {
    String processName =
      java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
    //return Long.parseLong(processName.split("@")[0]);
    return processName;
  }

  static class MyThread extends Thread {
	  public MyThread( String name) {
		  super(name);
	  }

	  public void run() {
		  System.out.println(getName());
		  Boolean forever = Boolean.TRUE;
		  while(forever) {
			  String msg = "My PID is " + getPID();
			  System.out.println("PID is " + msg);
			  try {
				sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	  }
	}
	
  public static void main(String[] args) {
    String msg = "My PID is " + getPID();
    System.out.println("PID is " + msg);
    
    //javax.swing.JOptionPane.showConfirmDialog((java.awt.Component)null, msg, "SystemUtils", javax.swing.JOptionPane.DEFAULT_OPTION);
    
    MyThread t1 = new MyThread("one");
    t1.start();
    
    try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

}