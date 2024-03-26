package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

class updatedynamic
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement p=con.prepareStatement("update empdata set name=?,sal=? where id=?");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter salary");
		int sal=sc.nextInt();
		

		System.out.println("enter id");
		int id=sc.nextInt();
		
		p.setString(1,name);
		p.setInt(2,sal);
		p.setInt(3,id);		

		p.execute();
		

		System.out.println("updated successfully");
		con.close();
		
	}
}