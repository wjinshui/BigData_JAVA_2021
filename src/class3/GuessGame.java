package class3;

import java.util.Random;
import java.util.Scanner;

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
					
					break;
				}
			}
			
		}
		Scanner scanner = new Scanner(System.in);
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
			}
		}

	}

}
