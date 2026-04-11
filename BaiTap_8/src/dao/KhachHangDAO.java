package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCCUtil;
import model.KhachHang;
import model.Sach;

public class KhachHangDAO implements DAOInterface<KhachHang> {
	public static KhachHangDAO getInstance() {
		return new KhachHangDAO();
	}

	@Override
	public int insert(KhachHang t) {
		int ketQua = 0;
		try {
			// TODO Auto-generated method stub
			Connection con = JDBCCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "INSERT INTO khachhang(id, hoVaTen, ngaySinh, diaChi) " +
		             "VALUES ('" + t.getId() + "','" + t.getHovaTen() + "','" + t.getNgaySinh() + "','" + t.getDiaChi() + "')";


		
		
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
	public int delete(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		ArrayList<KhachHang> ketQua =  new ArrayList<KhachHang>();
		
		try {
			// TODO Auto-generated method stub
			Connection con = JDBCCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "SELECT * FROM khachHang";
		
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			String id = rs.getString("id");
			String hovaTen = rs.getString("hovaTen");
			Date  ngaySinh = rs.getDate("ngaySinh");
			String diaChi = rs.getString("diaChi");
			
			KhachHang kh = new KhachHang(id, hovaTen, ngaySinh, diaChi);
			ketQua.add(kh);
		}
		
		JDBCCUtil.closeConnection(con);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override

		public KhachHang selectById(KhachHang t) {
		    KhachHang ketQua = null;

		    try {
		        Connection con = JDBCCUtil.getConnection();
		        Statement st = con.createStatement();

		        String sql = "SELECT * FROM khachhang WHERE id = '" + t.getId() + "'";
		        ResultSet rs = st.executeQuery(sql);

		        while (rs.next()) {
		            String id = rs.getString("id");
		            String hoVaTen = rs.getString("hoVaTen");
		            Date ngaySinh = rs.getDate("ngaySinh");
		            String diaChi = rs.getString("diaChi");

		            ketQua = new KhachHang(id, hoVaTen, ngaySinh, diaChi);
		        }

		        JDBCCUtil.closeConnection(con);

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return ketQua;
		}

	

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
	    ArrayList<KhachHang> ketQua = new ArrayList<>();

	    try {
	        Connection con = JDBCCUtil.getConnection();
	        Statement st = con.createStatement();

	        String sql = "SELECT * FROM khachhang WHERE " + condition;
	        ResultSet rs = st.executeQuery(sql);

	        while (rs.next()) {
	            String id = rs.getString("id");
	            String hoVaTen = rs.getString("hoVaTen");
	            Date ngaySinh = rs.getDate("ngaySinh"); // kiểu DATE trong DB
	            String diaChi = rs.getString("diaChi");

	            KhachHang kh = new KhachHang(id, hoVaTen, ngaySinh, diaChi);
	            ketQua.add(kh);
	        }

	        JDBCCUtil.closeConnection(con);

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return ketQua;
	}


	

}
