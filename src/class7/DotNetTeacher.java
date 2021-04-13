package class7;

public class DotNetTeacher extends Teacher
{

	public DotNetTeacher(String name, int age)
	{
		super(name, age);
		major = "Dotnet";		
	}
	
	@Override
	public void teach()
	{
	
		System.out.println("老师说啥呢，听不懂");
	}

}
