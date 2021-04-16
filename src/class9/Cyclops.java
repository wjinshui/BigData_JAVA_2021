package class9;

public class Cyclops extends Monster
{
	public Cyclops(String name, double hp, double atk, double def, String weapon)
	{
		super(name, hp, atk, def);
		this.weapon = weapon;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void showInfo()
	{
		System.out.println("名称：独眼巨人" + getName() + " 血量: "+ getHp() + " 攻击力：" + getAtk() + " 防御力： " +getDef() + " 武器：" + weapon);
	}

	private String weapon;

	@Override
	public void attack(Monster enemy)
	{
		double harm = this.getAtk() - enemy.getDef();
		if(harm < 1)
			harm = 1;
		enemy.setHp(enemy.getHp() - harm);
		System.out.println("独眼巨人" + getName() + "使用" + weapon + "攻击，对" + enemy.getName() + "造成" + harm + "点伤害");
		
	}
	
}
