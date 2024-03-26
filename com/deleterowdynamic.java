package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class deleterowdynamic
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		PreparedStatement s=con.prepareStatement("delete from new_table where id=?");
        Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id");
		int id=sc.nextInt();
		
		s.setInt(1,id);
		s.executeUpdate();
			con.close();
			System.out.println("row deleted successfullyyy");
	}
}