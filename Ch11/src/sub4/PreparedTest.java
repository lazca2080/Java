package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2022/09/15
 * 이름 : 박종협
 * 내용 : JDBC PreparedStatment 실습
 */
public class PreparedTest {
	public static void main(String[] args) {

		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/java2db";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
						
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행객체 생성
			String sql = "INSERT INTO `User1` VALUES (?,?,?,?);";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "j101");
			pstmt.setString(2, "김유신");
			pstmt.setString(3, "010-1022-1001");
			pstmt.setInt(4, 27);
			
			// 4단계 - SQL 실행
			pstmt.executeUpdate();
			
			// 5단계
			// 6단계
			pstmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료...");
	}
}
