package class9;

import java.util.ArrayList;

public class DNDGame
{

	public static void main(String[] args)
	{
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		monsters.add(new Cyclops("刘静茹", 200, 10, 5, "钉锤"));
		monsters.add(new Cyclops("屈建萍", 300, 8, 5, "狼牙棒"));
		monsters.add(new TreeMonster("叶永盛", 400, 5, 4, 1.75));
		monsters.add(new Hero("王老师", 80000, 500, 500));
		for (Monster monster : monsters)
		{
			monster.showInfo();
		}
		int index = 0;
		while(monsters.size()>1)
		{
			Monster cur = monsters.get(index);
			Monster enemy = monsters.get((index + 1) % monsters.size());
			cur.attack(enemy);
			if(enemy.isDeadth())
			{
				monsters.remove(enemy);
				System.out.println(enemy.getName() + "被" + cur.getName() + "活活打死，死得太惨了");				
			}
			index = (index + 1) % monsters.size();
					
		}
		System.out.println("********************************");
		System.out.println("胜利者是：");
		monsters.get(0).showInfo();

	}

}
