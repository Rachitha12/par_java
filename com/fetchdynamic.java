package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class fetchdynamic
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		PreparedStatement p=con.prepareStatement("select * from new_table where id=?");

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id");
		int id=sc.nextInt();
		
		p.setInt(1,id);
		ResultSet rs=p.executeQuery();
		rs.next();	

	System.out.println("empid:"+rs.getInt(1)+"empname:"+rs.getString(2));
	con.close();
	}
}
