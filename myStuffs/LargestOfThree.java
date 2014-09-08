package myStuffs;

import java.util.Scanner;

public class LargestOfThree{

    public static void main(String args[]) 
    {

        Scanner cmd = new Scanner(System.in);
        System.out.println("Please enter three different numbers to find largest of them");
        int first = cmd.nextInt();
        int second = cmd.nextInt();
        int third = cmd.nextInt();

        int largest = largestOfThree(first, second, third);
        System.out.println("Largest of three numbers between "+ first +", " + second +", " + third +" is " + largest);

        int greatest = greatestOfThreeUsingTernaryOperator(first, second, third);
        System.out.println("Greatest of three numbers in Java using ternary operator is " + greatest);

        //close the scanner to prevent resource leak
        cmd.close();

    }

    /**
     * Find largest of three numbers in Java. All three numbers must be
     * distinct.
     *
     * @param first
     * @param second
     * @param third
     * @return largest of three numbers, or Integer.MIN_VALUE if numbers are not
     * distinct.
     */
    public static int largestOfThree(int first, int second, int third) 
    {
        if (first > second && first > third) 
        {
            return first;
        } else if (second > first && second > third) 
        {
            return second;
        } else if (third > first && third > second) 
        {
            return third;
        }
        return Integer.MIN_VALUE;
    }

    /**
     * function to find largest of three numbers in Java using ternary operator
     * @param one
     * @param two
     * @param three
     * @return biggest of three numbers
     */
    public static int greatestOfThreeUsingTernaryOperator(int one, int two, int three) 
    {
        return (one > two) ? (one> three ? one : three) : (two > three ? two : three);
    }

}

