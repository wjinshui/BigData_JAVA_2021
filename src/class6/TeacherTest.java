package class6;

public class TeacherTest
{

	public static void main(String[] args)
	{
		Student stu1 = new Student("stu1");
		Student stu2 = new Student("stu2");
		stu1.classes = "bigdata";
		stu2.classes = "xxxx";
		System.out.println(Student.classes);
		
	}
}

class Student
{
	private String name, id, major;
	int age;
	static String classes;
	
	public void setAge(int age)
	{		
		this.age = age;
		this.getId();		

	}
	
	public static void temp()
	{
		classes = "10";		
		temp1();
		temp1();
	}
	
	public static void temp1()
	{
		temp();
	}

	public Student(String name, String major)
	{
		super();
		this.name = name;
		this.major = major;
	}

	public Student(String string)
	{
		// TODO Auto-generated constructor stub
	}

	public String getName()
	{
		return name;

	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getMajor()
	{
		return major;
	}

	public void setMajor(String major)
	{
		this.major = major;
	}

}