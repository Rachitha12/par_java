package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

class deletedynamic
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");

        Scanner sc=new Scanner(System.in);
		System.out.println("enter tablename");
		String tablename=sc.next();
        
		PreparedStatement s=con.prepareStatement("drop table "+tablename);
		
		s.execute();
		con.close();
		System.out.println("deleted table Successfully");
	}
}



//package com;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Scanner;
//
//class deletedynamic
//{
//	public static void main(String[] args)throws Exception
//	{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
//
//        Scanner sc=new Scanner(System.in);
//		System.out.println("enter tablename");
//		String tablename=sc.next();
//        
//		PreparedStatement s=con.prepareStatement("select * from "+tablename);
//		ResultSet rs=s.executeQuery();
//		rs.next();	
//		while(rs.next())
//		{
//
//	System.out.println("empid:"+rs.getInt(1)+"empname:"+rs.getString(2));
//		}
//		con.close();
////		System.out.println("deleted table Successfully");
//	}
//}
//
//package com;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.util.Scanner;
//
//class deletedynamic
//{
//public static void main(String[] args)throws Exception
//	{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
//
//        Scanner sc=new Scanner(System.in);
//		System.out.println("enter tablename");
//		String tablename=sc.next();
//        
//		PreparedStatement s=con.prepareStatement("delete from "+tablename);
//		
//		s.executeUpdate();
//		con.close();
//		System.out.println("deleted table Successfully");
//	}
//}

