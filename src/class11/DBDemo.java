package class11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBDemo
{

	public static void main(String[] args)
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection con =
					DriverManager.getConnection("jdbc:sqlite:source/" + "db.sqlite");
			System.out.println("success");
			Statement sta = con.createStatement();
			sta.executeUpdate("insert into student(id, name) values ('002', 'zhangsan')");
			
			ResultSet rs = sta.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getString(2));
			}

		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
