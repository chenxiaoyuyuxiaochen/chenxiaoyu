package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/book1?characterEncoding=utf-8","root","fengyu");
		
		String sql="insert into book value(100,'admin',1,1,1,1,1,1)";
		Statement stat = conn.createStatement();
		
		int rows = stat.executeUpdate(sql);
		System.out.println("影响行数为:"+rows);
		stat.close();
		conn.close();
	}
}
