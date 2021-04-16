package class9;

public class Hero extends Monster
{

	public Hero(String name, double hp, double atk, double def)
	{
		super(name, hp, atk, def);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Monster enemy)
	{
		double harm = this.getAtk();
		enemy.setHp(enemy.getHp() - harm);
		System.out.println("圣骑士" + getName() + "使用光的力量，对" + enemy.getName() + "造成" + harm + "点伤害");
		
	}

}
