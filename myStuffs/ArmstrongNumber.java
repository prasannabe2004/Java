package myStuffs;

class ArmstrongNumber
{
	public static boolean isArmstrongNum(int num)
	{
		//153 == 1*1*1 + 5*5*5 + 3*3*3
		int orginal = num;
		int sum = 0;
		int lastdigit  = 0;

		while(num != 0)
		{
			lastdigit = num%10;
			sum = sum + (lastdigit*lastdigit*lastdigit);
			num = num / 10;
		}
		if (sum == orginal)
		{
			System.out.println(orginal + " is a armstrong number");
			return true;
		}
		else
		{
			System.out.println(orginal+ " is not a armstrong number");
			return false;
		}

	} 

	public static void main(String[] args) 
	{
		
		isArmstrongNum(153);
	}
}