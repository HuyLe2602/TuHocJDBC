package test;

import java.util.ArrayList;

import dao.SachDAO;
import model.Sach;

public class TestSachDAO {
	public static void main(String[] args) {
		
		
//		Sach sach1 = new Sach("LTJV","Lap trinh Java", 50000, 2026);
//		Sach sach2 = new Sach("LTC","Lap trinh C", 40000, 2025);
//		
//		SachDAO.getInstance().insert(sach2);
		
		
//		for(int i=0; i<50; i++) {
//			Sach sach = new Sach("LT "+i,"Lap trinh i: "+i, 40000, 2016);
//			SachDAO.getInstance().insert(sach);
//		}
		
//		// test update
//		Sach sach2 = new Sach("LTC","Lap trinh C", 100000, 2027);
//		SachDAO.getInstance().update(sach2);
		
		//test delete
		
//		for(int i=0; i<50; i++) {
//			Sach sach = new Sach("LT "+i,"Lap trinh i: "+i, 40000, 2016);
//			SachDAO.getInstance().delete(sach);
//		}
		
		ArrayList<Sach> list = SachDAO.getInstance().selectAll();
		for(Sach sach:list) {
			System.out.println(sach.toString());
		}
		
		System.out.println("------------------------------------------------------");
		Sach find = new Sach();
		find.setId("LTC");
		
		Sach sach2 = SachDAO.getInstance().selectById(find);
		System.out.println(sach2);
		
		System.out.println("------------------------------------------------------");
		ArrayList<Sach> list2 = SachDAO.getInstance().selectByCondition("giaBan < 70000");
		for(Sach sach:list2) {
			System.out.println(sach.toString());
		}
		
		
		
		
	}
}
