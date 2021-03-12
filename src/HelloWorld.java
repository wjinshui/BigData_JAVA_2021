import java.util.Arrays;
import java.util.Random;


public class HelloWorld
{
	// 这是一些注释信息
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int []score = new int[10];
		Random random = new Random();
		for(int i = 0;i < 10; i++) {
			score[i] = random.nextInt(101);
		}
		int[] temp = score;
		Arrays.sort(score);
		for (int i : temp)
		{
			System.out.println(i);
		}

	}	


}