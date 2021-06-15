package class12;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class HanChar
{
	public static void main(String[] args)
	{
		System.out.println(getName(2));
	}
	public static String getName(int count) {
		String str = "";
		int hightPos, lowPos; 
		Random random = new Random();
		for (int i = 0; i < count; i++)
		{
			hightPos = (176 + Math.abs(random.nextInt(39)));//获取高位值
			lowPos = (161 + Math.abs(random.nextInt(93)));//获取低位值
			byte[] b = new byte[2];
			b[0] = (new Integer(hightPos).byteValue());
			b[1] = (new Integer(lowPos).byteValue());
			try
			{
				str = str + new String(b, "GBk");
			} catch (UnsupportedEncodingException e)
			{			
				e.printStackTrace();
			}
		}

		return str;
	}
}
