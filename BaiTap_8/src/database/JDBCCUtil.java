package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCCUtil {
    public static Connection getConnection() {
        Connection c = null;
        
        try {
           DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
           
            String url = "jdbc:mysql://localhost:3308/nhasach";
            String user = "root";       // thay bằng user MySQL của bạn
            String password = "";       // thay bằng mật khẩu MySQL của bạn

            // Tạo kết nối
            c = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return c;
    }
    public static void closeConnection(Connection c	) {
    	try {
    		if(c!=null) {
    			c.close();
    		}
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public static void printInfo(Connection c) {
    	if(c!=null) {
    		try {
    			DatabaseMetaData mtdt = c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
}
