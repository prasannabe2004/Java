public class ShellCommand
{
	public static void ExcecuteShellCommand(String cmd)
	{
		try 
		{
    			Process process = Runtime.getRuntime().exec(cmd);
    			process.waitFor();
		}
		catch (Exception e) 
		{
    			e.printStackTrace(System.err);
    		}
    	}

	public static void main (String args[])
	{
		ExcecuteShellCommand("ls -lrt");
    	}
}
