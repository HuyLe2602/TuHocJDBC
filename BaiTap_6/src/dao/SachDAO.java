package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



import database.JDBCCUtil;
import model.Sach;

public class SachDAO implements DAOInterface<Sach> {

	public static SachDAO getInstance() {
		return new SachDAO();
	}
	
	@Override
	public int insert(Sach t) {
		int ketQua = 0;
		try {
			// TODO Auto-generated method stub
			Connection con = JDBCCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql ="INSERT INTO sach(id, tenSach, giaBan, namXuatBan)"+
						"VALUES ('"+t.getId()+"','"+t.getTenSach()+"',"+t.getGiaBan()+",'"+t.getNamXuatBan()+"')";
		
		
		
		ketQua = st.executeUpdate(sql);
		
		System.out.println("Ban Da Thuc Thi: "+sql);
		System.out.println("Co: "+ketQua+" dong bi thay doi");
		
		JDBCCUtil.closeConnection(con);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int update(Sach t) {
		int ketQua = 0;
		try {
			// TODO Auto-generated method stub
			Connection con = JDBCCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "UPDATE sach " +
		             "SET tenSach='" + t.getTenSach() + "', " +
		             "giaBan=" + t.getGiaBan() + ", " +
		             "namXuatBan=" + t.getNamXuatBan() + " " +
		             "WHERE id='" + t.getId() + "'";

		
		
		ketQua = st.executeUpdate(sql);
		
		System.out.println("Ban Da Thuc Thi: "+sql);
		System.out.println("Co: "+ketQua+" dong bi thay doi");
		
		JDBCCUtil.closeConnection(con);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int delete(Sach t) {
		int ketQua = 0;
		try {
			// TODO Auto-generated method stub
			Connection con = JDBCCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "DELETE from sach " +
		             	" WHERE id='" + t.getId() + "\'";

		
		
		ketQua = st.executeUpdate(sql);
		
		System.out.println("Ban Da Thuc Thi: "+sql);
		System.out.println("Co: "+ketQua+" dong bi thay doi");
		
		JDBCCUtil.closeConnection(con);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sach selectById(Sach t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	
		
	

}
