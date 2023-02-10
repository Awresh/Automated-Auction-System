package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Buyer;
import com.masai.bean.Seller;
import com.masai.utility.DButility;

public class AdminDAOImpl implements AdminDAO
{
	@Override
	public List<Buyer> getBuyer() 
	{
		 List<Buyer> b = new ArrayList<>();
		
		try(Connection conn = DButility.provideConnection()) 
		{	
			PreparedStatement ps=  conn.prepareStatement("select * from Buyer");
			
			ResultSet rs =  ps.executeQuery();
			
			while(rs.next()) 
			{
				int id= rs.getInt("B_id");
				String name= rs.getString("B_name");
				String email = rs.getString("B_email");
				String password = rs.getString("B_password");
				
				b.add( new Buyer(id, name, email, password));
//				System.out.println(b);
//				
//				System.out.println("ID is :"+id);
//				System.out.println("Name is :"+name);
//				System.out.println("Email is :"+email);
//				System.out.println("Password is :"+password);
//				
//				System.out.println("=============================");
				
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public List<Seller> getSeller() 
	{
		List<Seller> s = new ArrayList<>();
		try(Connection conn = DButility.provideConnection())
		{
				PreparedStatement ps=  conn.prepareStatement("select * from Seller");
				
				ResultSet rs =  ps.executeQuery();
				
				while(rs.next()) 
				{
					int id= rs.getInt("S_id");
					String name= rs.getString("S_name");
					String email = rs.getString("S_email");
					String password = rs.getString("S_password");

					s.add(new Seller(id, name, email, password));
					
//					System.out.println("=============================");	
				}
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
	
		
		return s;
	}
}
