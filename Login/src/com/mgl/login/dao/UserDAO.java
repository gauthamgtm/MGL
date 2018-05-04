package com.mgl.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	public String getUser(String un,String pwd)  {
		Connection con=SingleTon.getSingleTonObject().getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement("select * from users where  username=? AND password=?");
			pstmt.setString(1, un);
			pstmt.setString(2, pwd);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				System.out.println("Ley ur name is - "+rs.getString("username"));
				return rs.getString("username");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
