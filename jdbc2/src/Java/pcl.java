package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pcl {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//建立连接
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/book1?characterEncoding=utf-8","root","fengyu");
		//执行sql
		String sql ="drop table bbb";
		Statement stat=conn.createStatement();
		//批处理
		stat.addBatch("INSERT I");
	}
	}
