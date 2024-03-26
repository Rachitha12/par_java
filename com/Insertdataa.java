package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Insertdataa
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		Statement s=con.createStatement();
		s.execute("insert into new_table values(1001,'rachitha'),(1002,'rachith'),(1003,'rachi'),(1004,'rach')");
		con.close();
		System.out.println(" table inserted  Successfully");
	}
}