package myStuffs;

 
import java.io.File;
import java.io.IOException;
 
public class CreateFile
{
	static String filename = "newfile.txt";
	static String dirname = "user.dir";

	CreateFile(String file, String dir)
	{
		filename = file;
		dirname = dir;
	}

	public static void OpenFile(String filename)
	{
	    try 
    	{
    		File file = new File(filename);
 			if (file.createNewFile())
			{
				System.out.println("File is created!");
			}
			else
			{
				System.out.println("File already exists.");
			}
    	}
    	catch (IOException e) 
    	{
			e.printStackTrace();
		}
	}
	public String ConstructFilepath()
	{
		String filepath = " ";
		String workingdir = System.getProperty(dirname);
		String workingos = System.getProperty("os.name");

		workingos = workingos.toLowerCase();
		System.out.println(workingos);
		if (workingos.startsWith("win"))
		{
			//Windows - Windows 7	
			filepath = workingdir + "\\" + filename;
		}
		else if(workingos.startsWith("linu"))
		{
			//Linux - TBD
			filepath = workingdir + "/" + filename;
		}
		System.out.println(filepath);
		return filepath;
	}

	public static void main( String[] args )
    {
    	CreateFile myJavadir = new CreateFile("java.txt", "user.dir");
    	String path = myJavadir.ConstructFilepath();
    	System.out.println(path);
    	OpenFile(path);
    }
}