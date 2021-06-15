package class11;

import java.io.File;
import java.io.IOException;

public class FileDemo
{
	public static void main(String[] args) 
	{
		
		FileDemo fileDemo = new FileDemo();
		fileDemo.showSubFile("C:/");
		//fileDemo.hideFile(file);
		/*
		 * File file = new File("C:\\Windows\\System32"); for (File subfile :
		 * file.listFiles()) { if(subfile.isDirectory())
		 * System.out.println(subfile.getName() + "\t\t<DIR>"); else
		 * System.err.println(subfile.getName() + "\t\t" + subfile.length()); }
		 */		
	}
	
	void showSubFile(String path)
	{
		File file = new File(path);
		System.out.println(file.getAbsolutePath());
		if(file.isDirectory())
		{
			File[] subfiles = file.listFiles() ;
			if(subfiles!= null)
			{
				for (File file2 : subfiles)
				{					
					showSubFile(file2.getAbsolutePath());
				}
			}
		}
		
	}
	
	void hideFile(File file)
	{
		try
		{
			Runtime.getRuntime().exec("attrib +h \"" + file.getAbsolutePath() + "\"");
			System.out.println("Íê³ÉÒþ²Ø");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
