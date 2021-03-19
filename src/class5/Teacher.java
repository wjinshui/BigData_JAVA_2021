package class5;

import java.util.ArrayList;

public class Teacher
{
	String name, title, degree;
	int age;

	ArrayList<String> courses = new ArrayList<String>();
	
	void dispInfo()
	{
		System.out.println("姓名: " + name + " 职称: " + title + "学位： " + degree + ", 教授的课程为");
		for (String course : courses)
		{
			System.out.print(course + "\t");
		}
	}
	
	public static void main(String[] args)
	{
		Teacher teacher = new Teacher();
		teacher.name = "张三";
		teacher.age = 10;
		
	}
}
