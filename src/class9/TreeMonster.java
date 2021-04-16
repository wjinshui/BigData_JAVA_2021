package class9;

public class TreeMonster extends Monster
{
	private double height;

	public TreeMonster(String name, double hp, double atk, double def, double height)
	{
		super(name, hp, atk, def);
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void showInfo()
	{	
		System.out.println("名称：树怪" + getName() + " 血量: "+ getHp() + " 攻击力：" + getAtk() + " 防御力： " +getDef() + " 高度：" + height);	
	}

	@Override
	public void attack(Monster enemy)
	{
		double harm = this.getAtk() - enemy.getDef();
		if(harm < 1)
			harm = 1;
		enemy.setHp(enemy.getHp() - harm);
		System.out.println("树怪" + getName() + "使用树枝缠绕攻击，对" + enemy.getName() + "造成" + harm + "点伤害");		
	}

}
