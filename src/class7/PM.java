package class7;

public class PM
{
	private String id, name, gender;
	private double salary, bonus, exp;
	
	
	public PM(String id, String name, String gender, double salary, double bonus, double exp)
	{
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.bonus = bonus;
		this.exp = exp;
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
	public double getBonus()
	{
		return bonus;
	}
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	public double getExp()
	{
		return exp;
	}
	public void setExp(double exp)
	{
		this.exp = exp;
	}
	
	
	public void show()
	{
		System.out.println("name: " + name + "; id: " + id);
	}
	
}
