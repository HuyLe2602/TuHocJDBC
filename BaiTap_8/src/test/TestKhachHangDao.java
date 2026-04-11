package test;

import java.util.ArrayList;

import dao.KhachHangDAO;
import dao.SachDAO;
import model.KhachHang;
import model.Sach;

public class TestKhachHangDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<KhachHang> list = KhachHangDAO.getInstance().selectAll();
		for(KhachHang kh:list) {
			System.out.println(kh.toString());
		}
		
		
		System.out.println("------------------------------------------------------");
		ArrayList<KhachHang> list2 = KhachHangDAO.getInstance().selectByCondition("ngaySinh > '2000-01-01'");
		for (KhachHang kh : list2) {
		    System.out.println(kh.toString());
		}

	}

}
