package class7;

public class SE_PMTest
{

	public static void main(String[] args)
	{
		SE se = new SE("001", "张三", "男", 4000, 1);
		PM pm = new PM("002", "李四", "女", 8000, 2000, 1.5);
		
		se.show();
		pm.show();
		

	}

}
