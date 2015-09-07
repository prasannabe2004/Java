
public class Constructor {

	/**
	 * @param args
	 */
	int x;
	
	public Constructor() {
		x = 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor ch = new Constructor();
		System.out.println(ch.x);
		ch.x = 25;
		System.out.println(ch.x);
		System.out.println("hello constructor\n");
	}
}
