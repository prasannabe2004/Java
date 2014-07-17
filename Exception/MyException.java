package Exception;

public class MyException 
{
    public static int GenerateRuntimeEx()
    {
        try
        {
            for(int i=5;i>=0;i--)
            {
                System.out.println(10/i);
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception... " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("After for loop... ");
        return 1;
    }

    public static void main(String a[])
    {
        GenerateRuntimeEx();
    }
}
