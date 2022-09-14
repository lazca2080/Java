package sub4;

import java.util.Properties;

/*
 * 날짜 : 2022/09/14
 * 이름 : 박종협
 * 내용 : 프로퍼티 실습하기
 */
public class PropertiesTest {
	
	public static void main(String[] args) {
		
		// 프로퍼티 생성
		Properties prop = new Properties();
		
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
	}
	
}
