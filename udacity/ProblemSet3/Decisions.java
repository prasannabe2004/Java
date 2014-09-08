package udacity.ProblemSet3;

public class Decisions
{
   public static void main(String[] args)
   {
	   	double orginal = 2 ;
	   	double root = Math.sqrt(orginal);
	   	double rootSquared = root * root;
	   	final double EPSILON = 1E-12;
	   	
	   	if(Math.abs(rootSquared - orginal) < EPSILON)
	   	{
	   		System.out.println("They are same");
	   	}
	   	else
	   	{
	   		System.out.println("rootSquared is " + rootSquared);
	   	}
   }
}

