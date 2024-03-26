package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class createdatabase
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement s=con.createStatement();
		 boolean a =s.execute("create database phone");
		 System.out.println(a);
		con.close();
		System.out.println("database Created Successfully");
	}
}