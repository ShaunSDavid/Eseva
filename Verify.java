package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Utility.*;

public class Verify {
	Connection con;
	public Verify() {
		// TODO Auto-generated constructor stub
	}
	public boolean validate(String accountName,String passwd)
	{
		boolean flag =false;
		boolean flag1 =false;
		try
		{		
		con = DBUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("Select Acc_name from details");
		PreparedStatement ps1 = con.prepareStatement("Select passwd from details");
		ResultSet rs = ps.executeQuery();
		ResultSet rs1 = ps1.executeQuery();
		while(rs.next())
		{
			
			if(rs.getString(1).equals(accountName))
			{
				//System.out.println(rs.getString(0));
				System.out.println(rs.getString(1));
				flag = true;
			}
		}
		while(rs1.next())
		{
			
			if(rs1.getString(1).equals(passwd))
			{
				//System.out.println(rs.getString(0));
				System.out.println(rs1.getString(1));
				flag1= true;
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//con.close();
		if((flag == true) && (flag1==true))
			return true;
		else
			return false;
	}
	public boolean validateAd(String adhaar,String Name,String Passwd,String passport,String reg)
	{
		boolean flag =false;
		try
		{		
		con = DBUtil.getConnection();
		String sql="insert into details(Acc_name,passwd,adhaar,passport,reg) values(?,?,?,?,?)";
		PreparedStatement p=con.prepareStatement(sql);
		p.setString(1, Name);
		p.setString(2, Passwd);
		p.setString(3, adhaar);
		p.setString(4, passport);
		p.setString(5, reg);
		p.executeUpdate();
		flag=true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//con.close();
		if(flag == true)
		{
			return true;
		}
		else
			return false;
	}
	public boolean Vpass(String pass)
	{
		boolean flag =false;
		try
		{		
		con = DBUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("Select passport from details");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			
			if(rs.getString(1).equals(pass))
			{
				//System.out.println(rs.getString(0));
				System.out.println(rs.getString(1));
				flag = true;
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//con.close();
		if(flag == true)
			return true;
		else
			return false;
	}
	public boolean Vchallan(String reg_no)
	{
		boolean flag =false;
		try
		{		
		con = DBUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("Select reg from details");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			
			if(rs.getString(1).equals(reg_no))
			{
				//System.out.println(rs.getString(0));
				System.out.println(rs.getString(1));
				flag = true;
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//con.close();
		if(flag == true)
			return true;
		else
			return false;
	}
}
