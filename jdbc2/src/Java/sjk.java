package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.woniu.utl.JdbcUtils;

public class sjk {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement stat=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		try {
			conn=JdbcUtils.getConn();
			String sql="INSERT INTO customer VALUES(?,?,?)";

			stat=conn.prepareStatement(sql);
			
			System.out.println("wid");
			int wid=sc.nextInt();
			System.out.println("wname");
			String wname=sc.next();
			System.out.println("remarks");
			String remarks=sc.next();
			
			stat.setInt(1,wid);
			stat.setString(2,wname);
			stat.setString(3,remarks);
			int row=stat.executeUpdate();
			
			} catch (ClassNotFoundException e) {
						e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtils.closeConn(rs, stat, conn);
		
	    }

}}
