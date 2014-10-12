package myStuffs;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NativeShellCommand
{
	public static StringBuffer ExcecuteShellCommand(String cmd)
	{
		StringBuffer output = new StringBuffer();
		try 
		{
    		Process process = Runtime.getRuntime().exec(cmd);
    		process.waitFor();
    		
    		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
    		String line = "";			
			while ((line = reader.readLine())!= null) 
			{
				output.append(line + "\n");
			}
		}
		catch (Exception e) 
		{
    		e.printStackTrace(System.err);
    	}
    	return output;
    }

	public static void main (String args[])
	{
		StringBuffer out = ExcecuteShellCommand("ping google.com");
		System.out.println(out);
    }
}

