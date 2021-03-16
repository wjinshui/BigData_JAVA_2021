package class4;

import java.util.ArrayList;

public class ListDemo
{

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.add("Hello");
		list.add("temp");
		list.add("world");
		System.out.println(list.size());
		System.out.println(list.isEmpty());

		
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.set(0, "Temp");
		Object obj = list.get(0);
		System.out.println(obj);
		
		System.out.println(list.contains("world"));
		System.out.println(list.indexOf("world"));
		

	}

}
