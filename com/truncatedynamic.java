package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

class truncatedynamic
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");

        Scanner sc=new Scanner(System.in);
		System.out.println("enter tablename");
		String tablename=sc.next();
        
		PreparedStatement s=con.prepareStatement("truncate table "+tablename);
		
		s.execute();
		con.close();
		System.out.println("deleted all rows Successfully");
	}
}

