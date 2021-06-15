package class12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo
{

	public static void main(String[] args)
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:source/db.sqlite");	
			int rowCount = 10000;
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("delete from student");
			
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement("insert into Student values(?, ?)");
			for(int i= 1; i< rowCount; i++)
			{
				ps.setInt(1, i);
				ps.setString(2, HanChar.getName(3));
				System.out.println(String.format("%s/%s", i,rowCount));
				ps.addBatch();		
			}			
			ps.executeBatch();
			conn.commit();
			ps.close();			
			conn.close();
			
			System.out.println("Mission Completed!");
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
