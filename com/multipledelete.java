package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class multipledelete
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement s=con.createStatement();
		int a=s.executeUpdate("delete from empdata2");
		System.out.println(a);
		con.close();
		System.out.println(" all row deleted successfullyyy");
	}
}
