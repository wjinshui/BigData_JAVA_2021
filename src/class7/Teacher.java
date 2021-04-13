package class7;

public class Teacher
{
	String name;
	int age;
	String major;
	
	public Teacher(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	public void sayHi()
	{
		System.out.println("姓名：" + name + "; 年龄: " + age + "; 专业： " + major);
	}
	
	public void teach()
	{
		System.out.println("正在试讲" + major);
	}
}
