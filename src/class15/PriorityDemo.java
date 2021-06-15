package class15;

public class PriorityDemo
{

	public static void main(String[] args)
	{
		Thread maxThread = new MyThread();
		Thread minThread = new MyThread();
		Thread norThread = new MyThread();
		maxThread.setPriority(Thread.MAX_PRIORITY);
		maxThread.setName("Max Priority");
		minThread.setPriority(Thread.MIN_PRIORITY);
		minThread.setName("Min Prioirty");
		norThread.setName("Normal Priority");		
		
		minThread.start();
		norThread.start();		
		maxThread.start();

	}
}

class MyThread extends Thread
{

	@Override
	public void run()
	{
		for (int i = 0; i < 10000; i++)
		{
			System.out.println("" + getName() + "  " + i);
		}
		
	}
	
}
