package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCCUtil;
import model.KhachHang;

public class KhachHangDAO implements DAOInterface<KhachHang> {

	@Override
	public int insert(KhachHang t) {
		int ketQua = 0;
		try {
			// TODO Auto-generated method stub
			Connection con = JDBCCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "UPDATE khachhang " +
		             "SET hovaTen='" + t.getHovaTen() + "', " +
		             "ngaySinh=" + t.getNgaySinh() + ", " +
		             "diaChi='" + t.getDiaChi() + "\' " +
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
	public int update(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
