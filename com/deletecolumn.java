package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class deletecolumn
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement s=con.createStatement();
		s.executeUpdate("alter table empdata2 drop column role");
			con.close();
			System.out.println("column deleted successfullyyy");
	}
}
