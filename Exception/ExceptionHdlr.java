import java.io.*;

class ExceptinHdlr 
{
    public static void main(String[] args) throws IOException 
    {
        if (args.length == 0) 
        {
            System.out.println("Must give filename as first arg.");
            return;
        }

        FileInputStream in;
        try 
        {
            in = new FileInputStream(args[0]);
        }
        catch (IOException e)
        {
            System.out.println("IO Exception detected " + e.getMessage());
            in = null;
        }
        int ch;
        while ((ch = in.read()) != -1) 
        {
            System.out.print((char) ch);
        }
        System.out.println();
        in.close();
    }
}
