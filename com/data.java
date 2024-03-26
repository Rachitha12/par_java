package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class data 
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement s=con.createStatement();
		System.out.println(s);
		
}
}
