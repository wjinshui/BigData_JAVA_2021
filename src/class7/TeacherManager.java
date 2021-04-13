package class7;

public class TeacherManager
{
	public void judge(Teacher t)
	{
		t.sayHi();
		t.teach();
	}	
	

	public static void main(String[] args)
	{
		TeacherManager tmq = new TeacherManager();
		tmq.judge(new JavaTeacher("李明", 25));
		tmq.judge(new DotNetTeacher("张明", 27));
	}
}
