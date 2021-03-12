package class3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CompSortAlgo
{

	public static void main(String[] args)
	{
		int[] arr1, arr2;
		int length;
		System.out.println("input the length of the array");
		Scanner scanner = new Scanner(System.in);
		length = scanner.nextInt();
		arr1 = new int[length];
		arr2 = new int[length];
		Random random = new Random();
		long start, end;
		for (int i = 0; i < arr1.length; i++)
		{
			arr1[i] = random.nextInt(101);
			arr2[i] = arr1[i];
		}
		start = System.currentTimeMillis();
		for (int i = 0; i < arr2.length -1; i++)
		{
			for(int j=i; j < arr2.length; j++)
				if( arr2[i] > arr2[j] )
				{
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}			
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
		
		start = System.currentTimeMillis();
		Arrays.sort(arr1);
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
