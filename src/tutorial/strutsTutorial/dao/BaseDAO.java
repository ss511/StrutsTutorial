package tutorial.strutsTutorial.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
	Connection conn;
	
	public Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("dbc:oracle:thin:@//localhost:1521/XE ", "system", "123");
		} catch (Exception e) {
			try {
				if(conn!=null)
					conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		if(conn!=null)
			return conn;
		else
			return null;
	}
	public void closeConnection(){
		try {
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
