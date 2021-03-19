package class5;

import java.util.ArrayList;

public class Student
{
	String name, num;
	private int age;
	private double weight;
	ArrayList<String> courses = new ArrayList<String>();
	
	
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int m_age)
	{
		if(m_age < 18)
			m_age = 18; 
		age = m_age;
	}
	
	void dispInfo()
	{
		
		System.out.println("姓名: " + name + " 学号: " + num + "年龄： " + age + ", 已选课程为");
		for (String course : courses)
		{			
			System.out.print(course + "\t");
		}	
		
	}
	
	void addCourse(String course)
	{
		courses.add(course);
		
	}
	
	void removeCourse(String course)
	{
		courses.remove(course);
	}
}
