package class10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo
{

	public static void main(String[] args) 
	{
		exceptDemo();
	}

	private static void exceptDemo() 
	{
		System.out.println("请输入年龄");
		Scanner scanner = new Scanner(System.in);
		try
		{
			int age = scanner.nextInt();
			System.out.println(age);
			if(age < 0)
				throw new AgeException("输入的年龄不能小于0");
			System.out.println("输入的年龄是 " + age);
		}

		catch (InputMismatchException e)
		{
			System.out.println("请输入合法数字");

		} catch (ArithmeticException e)
		{
			System.out.println("请输入非0数字");
		} 
		catch (AgeException e) {
			System.out.println("年龄数据异常： " + e.getMessage());
		}
	}
}

class AgeException extends Exception
{
	public AgeException(String msg)
	{
		super(msg);
	}
}
