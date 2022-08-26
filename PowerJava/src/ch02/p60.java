package ch02;

/*
 * 날짜 : 2022/08/26 
 * 이름 : 박종협
 * 내용 : 원의 면적 계산하기
 */
public class p60 {
	public static void main(String[] args) {
		final double PI = 3.141592;
		double radius, area;
		
		radius = 5;
		area = PI * radius * radius;
		
		System.out.println("반지름이 5인 원의 면적은 " + area);
		
	}

}
