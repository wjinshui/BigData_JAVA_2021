package class3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class GuessGame
{

	public static void main(String[] args)
	{
		int[] answers = new int[4];
		boolean[] flags = new boolean[10];
		Random random = new Random();		
		for (int i = 0; i < answers.length; i++)
		{
			while(true)
			{
				int number = random.nextInt(10);
				if(flags[number] == false)
				{
					flags[number] = true;
					answers[i] = number;		
					System.out.println(number);
					break;
				}
			}
			
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择游戏难度: 1(简单模式）， 2（一般模式）， 3（困难模式）");
		int level = scanner.nextInt();
		int max =0;
		if(level == 1)
			max = 12;
		else if(level == 2)
			max = 9;
		else {
			max = 7;
		}
		int cnt =0;
		while(true)
		{
			System.out.println("请输入四个0-9之间的数字: ");
			int[] inputs = new int[answers.length];
			for (int i = 0; i < inputs.length; i++)
			{
				inputs[i] = scanner.nextInt();
			}
			int a =0, b=0;
			for (int i = 0; i < answers.length; i++)
			{
				for (int j = 0; j < inputs.length; j++)
				{
					if(inputs[j] == answers[i])
						b ++;
				}
			}
			for (int i = 0; i < inputs.length; i++)
			{
				if(answers[i] == inputs[i])
					a++;
			}
			b = b - a;
			System.out.println(a+ "A" + b + "B");
			if(a == 4)
			{
				System.out.println("好厉害啊。。游戏结束");
				break;
			}
			cnt ++;
			if(cnt == max)
			{
				System.out.println("游戏失败");
				break;
			}
		}

	}

}
