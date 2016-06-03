package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conn.DBConnect;

public class DaoImpl implements Dao {

	private Connection conn;
	private DBConnect db;
	private PreparedStatement pstmt;
	
	public DaoImpl(){
		db = DBConnect.getInstance();
	}
	
	@Override
	public void insert(Member m) {
		conn = db.getConnection();
		String sql = "	";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, m.getNum());
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			
			if(pstmt != null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			db.connClose(conn);
		}
				
	}

	@Override
	public Member select(int num) {
		return null;
		
	}

	@Override
	public void update(Member m) {
		

	}

	@Override
	public void delete(int num) {

	}

}
