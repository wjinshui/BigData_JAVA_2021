package class5;

public class StudentTest
{

	public static void main(String[] args)
	{
		Student 屈建萍 = new Student();
		屈建萍.name = "屈建萍";
		
		屈建萍.setAge(1);
		
		
		屈建萍.num = "07";
		屈建萍.addCourse("体育");
		屈建萍.addCourse("面向对象--xxxx");
		//屈建萍.dispInfo();
		System.out.println(屈建萍.getAge());
		
	}

}
