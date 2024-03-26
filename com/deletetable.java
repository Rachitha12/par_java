package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class deletetable
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement s=con.createStatement();
		s.execute("drop table empdata2");
//		System.out.println(a);
		con.close();
		System.out.println("deleted table Successfully");
	}
}
