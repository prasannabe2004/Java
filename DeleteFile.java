import java.io.*;

public class DeleteFile
{
    public static void DeleteMyFile(String filename)    
    {
        try
        {

            File file = new File("filename");
            try
            {
                if(file.exists())
                {
                    if(file.delete())
                    {
                        System.out.println(file.getName() + " is deleted!");
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {	
        DeleteMyFile("/home/prasanna/test.txt");    
    }
}