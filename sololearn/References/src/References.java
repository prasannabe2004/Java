
public class References {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world\n");
		
		int x = 5;
		addOneTox(x);
		
		System.out.println(x);
		
		Person john = new Person(25);
		
		System.out.println(john.getAge());
		
		celebrateBirthday(john);
		
		System.out.println(john.getAge());
		
	}
	
	static void celebrateBirthday(Person P) {
		P.setAge(P.getAge() + 1);
	}
	
	static void addOneTox(int num) {
		num++;
	}

}
