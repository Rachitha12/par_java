package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class inserting
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement s=con.createStatement();
		s.execute("insert into empdata2 values(1001,'rachitha',20000,'rachitha@gmail.com',9089786759),(1002,'kushi',10000,'kushi@gmail.com',9085822665),(1003,'supritha',30000,'supritha@gmail.com',9089886759),(1004,'dhanvitha',50000,'dhanvitha@gmail.com',9085886759),(1005,'manvith',90000,'manvith@gmail.com',9876543210),(1006,'parshu',80000,'parshu@gmail.com',9123654789)");
		con.close();
		System.out.println(" table inserted  Successfully");
	}
}