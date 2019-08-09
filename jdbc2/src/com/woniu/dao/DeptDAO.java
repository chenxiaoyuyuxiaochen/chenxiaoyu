package com.woniu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.woniu.bean.Dept;
import com.woniu.utl.JdbcUtils;

public class DeptDAO {
	Connection conn;
	PreparedStatement stat;
	ResultSet rs;
	
	public List<Dept> findAll() {
		String sql="select*from department";
		List<Dept> depts=new ArrayList<Dept>();
		try {
			conn=JdbcUtils.getConn();
			stat=conn.prepareStatement(sql);
			rs=stat.executeQuery();
			while(rs.next()) {
				Dept dept = new Dept();
				dept.setDid(rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setAddress(rs.getString(3));
				
				depts.add(dept);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.closeConn(rs, stat, conn);
		}
		return depts;
		}
	
}
