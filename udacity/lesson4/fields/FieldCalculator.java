package udacity.lesson4.fields;

import java.math.*;

public class FieldCalculator
{
    int radius = 400;
    int diameter = 2 * radius;
    
    /**
     * Calculates the number of circular fields of Radius 400 meters
     * that can fit on a plot
     * of land if the first row starts all the way at the left, and
     * the second row starts one radius away from the left edge as
     * described in the question video, and the circles are as close
     * together as they can be without overlapping.
     */
    public int getNumberOfFields(int width, int length)
    {
        // YOUR CODE HERE
        // Use the equations from the last few questions
        // and the mathematical operations you've learned in this lesson
        // You've done an example by hand. Now code it up!
    	int numerOfRows = (int)((length-diameter)/(radius*Math.sqrt(3)))+1; 
    	System.out.println(numerOfRows);
    	int oddRows = numerOfRows/2 +1;
    	int evenRows = numerOfRows/2;
    	System.out.println(oddRows + " " + evenRows);
    	int circlesInOddRow = width/diameter; 
    	int circlesInEvenRow = (width - radius)/diameter;
    	System.out.println(circlesInOddRow + " " + circlesInEvenRow);
    	
    	int fields = (oddRows*circlesInOddRow) + (evenRows*circlesInEvenRow);
    	return fields;
    			
    }
}
