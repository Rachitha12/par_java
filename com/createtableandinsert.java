package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class createtableandinsert
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement s=con.createStatement();
		s.execute("create table stddetails(stdid int primary key,stdname varchar(20) not null,marks int,email varchar(30) unique,phone bigInt unique)");
		s.execute("insert into stddetails values(1,'rachitha',90,'rachitha@gmail.com',9089786759),(2,'kushi',80,'kushi@gmail.com',9085822665),(3,'supritha',70,'supritha@gmail.com',9089886759),(4,'dhanvitha',50,'dhanvitha@gmail.com',9085886759),(5,'manvith',98,'manvith@gmail.com',9876543210),(6,'parshu',66,'parshu@gmail.com',9123654789)");
		con.close();
		System.out.println(" table created n inserted Successfully");
	}
}