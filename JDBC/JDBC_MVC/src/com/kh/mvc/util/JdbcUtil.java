package com.kh.mvc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	/*
	private final String URL = "jdbc:oracle:thin:@192.168.130.17:1521:xe";
	private final String USERNAME = "KH00_TEACHER";
	private final String PASSWORD = "KH1234";
	*/
	/*
	 * JDBC API 사용 중 중복 코드가 너무 많음!
	 * 중복된 코드를 메소드로 분리하여 필요할 때 마다 '재사용'하자 
	 */
	{
		//B b = (B)new C();
		//b.print();
		// System.out.println((double)1 + 1.1);
		// 자료형이 다른 값 끼리는 연산이 불가능
		// 연산의 결과도 항상 같은 자료형으로 나옴
	}
	
	public static Connection getConnection() {
		
		final String URL = "jdbc:oracle:thin:@192.168.130.17:1521:xe";
		final String USERNAME = "KH00_TEACHER";
		final String PASSWORD = "KH1234";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			if(stmt != null) {
				stmt.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rset) {
		try {
			if(rset != null) {
				rset.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	

}
