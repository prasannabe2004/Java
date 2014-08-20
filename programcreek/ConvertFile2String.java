package programcreek;


import java.io.*;

public class ConvertFile2String {
public static String readFileToString() throws IOException {
		File dirs = new File(".");
		String filePath = dirs.getCanonicalPath() + File.separator+"ConvertFile2String.java";
		System.out.println(filePath);
 
		StringBuilder fileData = new StringBuilder(1000);//Constructs a string buffer with no characters in it and the specified initial capacity
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
 
		char[] buf = new char[1024];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}
 
		reader.close();
 
		String returnStr = fileData.toString();
		System.out.println(returnStr);
		return returnStr;
	}
public static void  main(String[] args)
{
	try
	{
		readFileToString();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
