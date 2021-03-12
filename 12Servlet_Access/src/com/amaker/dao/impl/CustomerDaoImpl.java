package com.amaker.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.amaker.bean.Customer;
import com.amaker.dao.CustomerDao;
import com.amaker.util.Dbutil;

public class CustomerDaoImpl implements CustomerDao {

	
	public void save(Customer c) {
		Dbutil util = new Dbutil();
		Connection conn = util.getConnection();
		String sql = "insert into usertb2(name,email)values(?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getName());
			pstmt.setString(2, c.getEmail());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			util.closeConnection(conn);
		}
		
		
	}

	
	public List list() {
		Dbutil util = new Dbutil();
		Connection conn = util.getConnection();
		String sql = "select id,name,email from usertb2";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			List list = new ArrayList(); 
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				Customer c = new Customer();
				c.setEmail(email);
				c.setId(id);
				c.setName(name);
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			util.closeConnection(conn);
		}
		return null;
	}

}
