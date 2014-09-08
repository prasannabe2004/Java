package udacity.ProblemSet3;

import java.util.*;

public class MilagePrinter
{
	final static double COST_PER_GALLON = 3.95;
	
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter the number of gallons of gas in the tank ");
        double gallonsInTank = sc.nextDouble();
        
        System.out.print("Enter the fuel efficiency ");
        double efficiency = sc.nextDouble();
        
        double distance = gallonsInTank*efficiency;
        double cost = (100/efficiency) * COST_PER_GALLON;
        
        if (efficiency <= 0)
        {
        	System.out.println("No can go");
        }
        else
        {
        	System.out.print("Distance: ");
        	System.out.printf("%6.1f\n", distance); 
        	System.out.print("Cost: ");
        	System.out.printf("%10.2f\n", cost);
        }
        sc.close();
    }
}