package ProgramingTest;

import java.sql.Connection;

public class UserDao {
	// 싱글톤
	private static UserDao instance = new UserDao();
	public static UserDao getInstance() {
		return instance;
	}
	private UserDao() {}
	
	// DB정보
	String host = "jdbc:mysql://127.0.0.1:3306/java2db";
	private String user = "root";
	private String pass = "1234";
	
	private Connection getConnection() {
		class.forName("com.mysql")
	}
	
}
