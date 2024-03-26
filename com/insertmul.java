package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class insertmul
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement s=con.createStatement();
		s.execute("insert into empdata values(101,'rachithaa',220000,'rachitha10@gmail.com',908786759),(102,'kushi',10000,'kushi@gmail.com',9085822665),(103,'supritha',30000,'supritha@gmail.com',9089886759),(104,'dhanvitha',50000,'dhanvitha@gmail.com',9085886759),(105,'manvith',90000,'manvith@gmail.com',9876543210),(1006,'parshu',80000,'parshu@gmail.com',9123654789)");
		con.close();
		System.out.println(" table inserted  Successfully");
	}
}