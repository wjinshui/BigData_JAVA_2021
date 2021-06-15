package class11;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;


class FileHelper
{
	public  static void copy(String source, String dest)
	{
		
	}
	
	public static void cut(String source, String dest)
	{
		copy(source, dest);
		File file = new File(source);
		file.delete();
	}
}

public class FISDemo
{

	public static void main(String[] args)
	{
		FileHelper.cut("c:/xxx.txt", "d:/tttt.txt");
		
		File file = new File("D:\\baidupan\\工程学院\\基金\\结题材料\\引导性项目\\2018H0002海量数据采集与处理系统研发\\FileRecv\\福建工程学院信息科学与工程学院全体教职工合影留念.jpg"); //中这是夺工胡大
		try
		{
			byte[] buff = new byte[4 * 1024 * 1024];
			FileInputStream fis = new FileInputStream(file);
			fis.read(buff);
			System.out.print(buff);
			fis.close();
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
			scanner.close();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
