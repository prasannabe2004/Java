class SwapNumbers
{

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;

		System.out.println("Orginal Numbers are " + a + " and " + b);

		System.out.println("Lets try with + and - operators first");
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Swapped Numbers are " + a + " and " + b);

		a = 10;
		b = 20;

		System.out.println("Lets try with bit operators");
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Swapped Numbers are " + a + " and " + b);

		a = 10;
		b = 20;

		System.out.println("Lets try with * and / operators");
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("Swapped Numbers are " + a + " and " + b);
	}
}