package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class createtable
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement s=con.createStatement();
		s.execute("create table empdata(id int primary key,name varchar(20) not null,sal int,email varchar(30) unique,phone bigInt unique)");
		con.close();
		System.out.println(" table created Successfully");
	}
}