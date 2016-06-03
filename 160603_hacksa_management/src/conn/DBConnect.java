package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	private static DBConnect db = new DBConnect();
	private Connection conn = null;
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	private DBConnect() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName(jdbc_driver);
			// �����ͺ��̽� ���������� �̿��� Connection �ν��Ͻ� Ȯ��
			 conn = DriverManager.getConnection(jdbc_url, "kitri04", "kitri04");			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static DBConnect getInstance() {
		return db;
	}
	public Connection getConnection(){
		return conn;
	}
	
	public void connClose(Connection conn){
		if(conn != null){
			try {
				conn.close();
				System.out.println("커넥션 클로즈 널인가?"+conn);
				conn = DriverManager.getConnection(jdbc_url, "kitri04", "kitri04");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
