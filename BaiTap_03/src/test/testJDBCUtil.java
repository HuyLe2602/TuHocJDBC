package test;

import java.sql.Connection;

import database.JDBCCUtil;

public class testJDBCUtil {
	public static void main(String[] args) {
		Connection connection = JDBCCUtil.getConnection();
		
		JDBCCUtil.printInfo(connection);
		
		JDBCCUtil.closeConnection(connection);
	
	}
}
