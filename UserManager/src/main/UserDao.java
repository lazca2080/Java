package main;

/*
 * 날짜 : 2022/09/23
 * 이름 : 박종협
 * 내용 : 프로그래밍 언어 응용_문제 4. 프로그램 작성
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	// 싱글톤
	private static UserDao instance = new UserDao();
	public static UserDao getInstance()	{
		return instance;
	}
	
	// DB정보
	String host = "jdbc:mysql://127.0.0.1:3306/java2db";
	String user = "root";
	String pass = "1234";
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(host, user, pass); 
		return conn;
	}
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public void insertUser(User user) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getHp());
			psmt.setInt(4, user.getAge());
			psmt.executeUpdate();
			close();
		
		} catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("아이디 또는 휴대폰 중복입니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<User> selectUsers()	{
		List<User> users = new ArrayList<>();
		
			try {
				conn = getConnection();
				psmt = conn.prepareStatement(SQL.SELECT_USERS);
				rs = psmt.executeQuery();
				
				while(rs.next()) {
					User user = new User();
					user.setUid(rs.getString(1));
					user.setName(rs.getString(2));
					user.setHp(rs.getString(3));
					user.setAge(rs.getInt(4));
					
					users.add(user);
				}
				close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return users;
	}
	
	public User selectUser(String name) {
		
		User user = new User();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER);
			psmt.setString(1, name);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setHp(rs.getString(3));
				user.setAge(rs.getInt(4));
			}
			close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
		
	}
		
	public int deleteUser(String name) {
		
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DLETE_USER);
			psmt.setString(1, name);
			
			result = psmt.executeUpdate();
			
			close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	
	}
	
	private void close() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		
		if(rs != null) {
			psmt.close();
		}
		
		if(rs != null) {
			conn.close();
		}
	}
}// UserDao end
