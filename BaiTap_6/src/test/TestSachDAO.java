package test;

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
		
		for(int i=0; i<50; i++) {
			Sach sach = new Sach("LT "+i,"Lap trinh i: "+i, 40000, 2016);
			SachDAO.getInstance().delete(sach);
		}
	}
}
