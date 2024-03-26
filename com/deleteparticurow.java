package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class deleteparticurow
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement s=con.createStatement();
		s.executeUpdate("delete from empdata2 where id=1002");
			con.close();
			System.out.println("row deleted successfullyyy");
	}
}
