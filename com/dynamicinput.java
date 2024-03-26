package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

class dynamicinput
{
	public static void main(String[] args)throws Exception

	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement p=con.prepareStatement("insert into empdata values(?,?,?,?,?)");
		
		Scanner sc=new Scanner(System.in);
		
		boolean x;
		System.out.println("do u want to enter data");
		
		x=sc.nextBoolean();
		while(x==true) 
		{
		System.out.println("enter id");
		int id=sc.nextInt();
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter salary");
		int sal=sc.nextInt();
		
		System.out.println("enter email");
		String mail=sc.next();
		
		System.out.println("enter phnum");
		long phnum=sc.nextLong();
		
		p.setInt(1,id);
		p.setString(2,name);
		p.setInt(3,sal);
		p.setString(4,mail);
		p.setLong(5,phnum);
		p.execute();
		}
		System.out.println("inserted successfully");
		con.close();
	}
}65
8
