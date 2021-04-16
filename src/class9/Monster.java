package class9;

public abstract class Monster
{
	private String name;
	private double hp, atk, def;
	
	public void showInfo()
	{
		System.out.println("名称：" + name + " 血量: "+ hp + " 攻击力：" + atk + " 防御力： " +def);		
	}
	
	public boolean isDeadth()
	{
		return hp<=0;
	}
	
	
	public Monster(String name, double hp, double atk, double def)
	{
		super();
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getHp()
	{
		return hp;
	}

	public void setHp(double hp)
	{
		this.hp = hp;
	}

	public double getAtk()
	{
		return atk;
	}

	public void setAtk(double atk)
	{
		this.atk = atk;
	}

	public double getDef()
	{
		return def;
	}

	public void setDef(double def)
	{
		this.def = def;
	}

	public abstract void attack(Monster enemy);
	
}
