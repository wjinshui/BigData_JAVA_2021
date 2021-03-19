import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChooseStu
{
	int total = 46;

	public static void main(String[] args)
	{
		ChooseStu chooseStu = new ChooseStu();
		chooseStu.waitPickStu(3, 0);
	}

	void waitPickStu(int count, int minutes)
	{
		int seconds = minutes * 60;
		if(seconds >0)
			System.out.println("开始倒计时");
		try
		{
			while (seconds > 0)
			{
				Thread.sleep(1000);
				System.out.println(seconds);
				seconds--;
			}
			System.out.println("以下同学请将代码复制到群上");
			pickStu(count);

		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}

	void pickStu(int count)
	{
		List<Integer> stus = new ArrayList<Integer>();
		for (int i = 0; i < total; i++)
		{
			stus.add(i);
		}
		Collections.shuffle(stus);
		for (int i = 0; i < count; i++)
		{
			System.out.print(stus.get(i) + ",");
		}
		System.out.println();
	}
}
