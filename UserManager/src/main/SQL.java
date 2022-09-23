package main;

/*
 * 날짜 : 2022/09/23
 * 이름 : 박종협
 * 내용 : 프로그래밍 언어 응용_문제 4. 프로그램 작성
 */
public class SQL {
	public static final String INSERT_USER = "INSERT INTO `User3` VALUES (?,?,?,?);";
	public static final String SELECT_USERS = "SELECT * FROM `User3`;";
	public static final String SELECT_USER = "SELECT * FROM `User3` WHERE `name`=?;";
	public static final String DLETE_USER = "DELETE FROM `User3` WHERE `uid`=?;";
	
}
