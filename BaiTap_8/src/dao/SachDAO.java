package dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
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
		ArrayList<Sach> ketQua =  new ArrayList<Sach>();
				
		try {
			// TODO Auto-generated method stub
			Connection con = JDBCCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "SELECT * FROM sach";
		
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			String id = rs.getString("id");
			String tenSach = rs.getString("tenSach");
			float giaSach = rs.getFloat("giaBan");
			int namXuatBan = rs.getInt("namXuatBan");
			
			Sach sach = new Sach(id, tenSach, giaSach, namXuatBan);
			ketQua.add(sach);
		}
		
		JDBCCUtil.closeConnection(con);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public Sach selectById(Sach t) {
		 Sach ketQua = null;
		
		try {
			// TODO Auto-generated method stub
			Connection con = JDBCCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "SELECT * FROM sach where id= '"+t.getId()+"'";
		
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			String id = rs.getString("id");
			String tenSach = rs.getString("tenSach");
			float giaSach = rs.getFloat("giaBan");
			int namXuatBan = rs.getInt("namXuatBan");
			
			Sach sach = new Sach(id, tenSach, giaSach, namXuatBan);
			ketQua = new Sach(id, tenSach, giaSach, namXuatBan);
		}
		
		JDBCCUtil.closeConnection(con);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condition) {
		ArrayList<Sach> ketQua =  new ArrayList<Sach>();
		
		try {
			// TODO Auto-generated method stub
			Connection con = JDBCCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "SELECT * FROM sach where "+condition;
		
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			String id = rs.getString("id");
			String tenSach = rs.getString("tenSach");
			float giaSach = rs.getFloat("giaBan");
			int namXuatBan = rs.getInt("namXuatBan");
			
			Sach sach = new Sach(id, tenSach, giaSach, namXuatBan);
			ketQua.add(sach);
		}
		
		JDBCCUtil.closeConnection(con);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}
	
	
	
	
		
	

}
