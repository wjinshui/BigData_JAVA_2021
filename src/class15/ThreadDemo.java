package class15;

class BoilThread implements Runnable
{
	@Override
	public void run()
	{		
		try
		{
			System.out.println("开始烧水了");
			Thread.sleep(10 * 1000);
			System.out.println("水烧开了");			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}		
	}
}


class WashThread implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			try
			{
				System.out.println("开始洗第" + (i +1) + "个茶杯") ;
				Thread.sleep(1500);
				System.out.println("第" + (i +1) + "个茶杯洗好了") ;			
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class ThreadDemo
{

	public static void main(String[] args)
	{	
		Thread boilThread = new Thread(new BoilThread());
		Thread washThread = new Thread(new WashThread());	
		boilThread.start();;
		washThread.start();;
		
		

	}

}
