package class2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CompaEff
{
	public static void main(String[] args)
	{
		int count;
		int[] arr1, arr2;
		System.out.println("input the length of array");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		arr1 = new int[count];
		arr2 = new int[count];
		Random random = new Random();
		for(int i=0; i< count; i++)
		{
			arr1[i] = random.nextInt(101);
			arr2[i] = arr1[i];
		}
		long start, end;
		start = System.currentTimeMillis();
		for(int i=0; i< arr1.length-1; i++)
			for(int j = i; j<arr1.length; j++)
				if(arr1[i]  > arr1[j])
				{
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
		end = System.currentTimeMillis();
		System.out.println(end - start);
		start =  System.currentTimeMillis();
		Arrays.sort(arr2);
		end = System.currentTimeMillis();
		System.out.println(end - start);
		
	}
}
