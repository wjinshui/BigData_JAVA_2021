package class7;

public class PM extends Employee
{
	
	private double bonus, exp;	
	
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
}
