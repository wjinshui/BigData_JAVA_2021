package class4;

import java.util.ArrayList;
import java.util.Collections;

public class GuessNumber
{

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList();
		int[] answers = new int[4];		
		for(int i = 0;  i< 10; i++)
		{
			list.add(i);
		}
		Collections.shuffle(list);
		for (int i = 0; i < answers.length; i++)
		{
			answers[i] = list.get(i);
		}
		for (int i : answers)
		{
			System.out.println(i);
		}
		System.out.println( Collections.max(list));
		System.out.println( Collections.min(list));
		
	}

}

class Fruit
{
	
}

class Student
{
	String name;
	int age;
	
	void study()
	{
		
	}	
}

