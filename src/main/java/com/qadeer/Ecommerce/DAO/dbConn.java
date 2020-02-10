package com.qadeer.Ecommerce.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbConn 
{
	public void Connect(String a,String b,String c,String d)
	{
		try 
		{	
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","QADEER","pgp");
			PreparedStatement ps=conn.prepareStatement("insert into users1 values(?,?,?,?)");
			   ps.setString(1,a);
			   ps.setString(2,b);
			   ps.setString(3,c);
			   ps.setString(4,d);
			   ps.executeUpdate();
			   conn.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
