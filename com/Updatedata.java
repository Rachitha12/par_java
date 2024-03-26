package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Updatedata
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement s=con.createStatement();
		int a=s.executeUpdate("update empdata2 set sal=30000 where id=1001");
		System.out.println(a);
		con.close();
		System.out.println("updated  Successfully");
	}
}