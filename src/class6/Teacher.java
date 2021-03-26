package class6;

public class Teacher
{
	private String name, degree, position;
	private int age;
	public void introduce()
	{
		System.out.println("Name: " + name + ", degree: " + degree + " position: " + position);
	}
	
	public String getName()
	{
		return name;
	}

	public String getDegree()
	{
		return degree;
	}

	public void setDegree(String degree)
	{
		this.degree = degree;
	}

	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	
}
