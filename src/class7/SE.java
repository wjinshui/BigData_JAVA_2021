package class7;

public class SE
{
	private String id, name, gender;
	private double salary;
	private int hot;
	public SE(String id, String name, String gender, double salary, int hot)
	{
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.hot = hot;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public int getHot()
	{
		return hot;
	}
	public void setHot(int hot)
	{
		this.hot = hot;
	}
	
	public void show()
	{
		System.out.println("name: " + name + "; id: " + id);
	}
	
	
	
	
}
