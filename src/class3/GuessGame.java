package class3;

import java.util.Random;

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
		
		for (int i : answers)
		{
			System.out.println(i);
		}

	}

}
