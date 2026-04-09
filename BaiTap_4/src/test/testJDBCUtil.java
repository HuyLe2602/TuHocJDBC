package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCCUtil;

public class testJDBCUtil {
	public static void main(String[] args) {
		
		//B1
		Connection connection = JDBCCUtil.getConnection();
		
		try {
			//B2: Tao ra doi tuong statement
			Statement st = connection.createStatement();
			//B3:Thuc Thi cau lenh sql
			String sql = "INSERT INTO persons1(person_id,last_name,first_name, gender, dob, income)\r\n"
					+ "VALUES \r\n"
					+ "(4,\"Nguyen\", \"Hoang Anh D\",\"M\", \"2002-1-11\", 10000000)";
			
			//B4 Xu ly Ket Qua
			int check = st.executeUpdate(sql);
			System.out.println("So dong thay doi: "+check);
			if(check>0) {
				System.out.println("Them du lieu thanh cong!!");
			}else
			{
				System.out.println("Them du lieu that bai");
			}
			
			//B5
			JDBCCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
