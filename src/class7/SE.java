package class7;

public class SE extends Employee
{	
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
	public int getHot()
	{
		return hot;
	}
	public void setHot(int hot)
	{
		this.hot = hot;
	}
	
}
