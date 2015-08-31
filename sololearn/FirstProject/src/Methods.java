
public class Methods {

	/**
	 * @param args
	 */
	
	static void sayGreeting() {
		System.out.println("Explaining Methods\n");
	}
	
	static void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	static int something(int x) {
		return x*x;
	}
	public static void main(String[] args) {
		sayGreeting();
		sayHello("Prasanna");
		System.out.println("Output is " + something(4) + "\n");
	}
	
}
