package ch04;

public class P147_CircleTest {
	public static void main(String[] args) {
		
		//Circle obj;
		
		//obj = new Circle();
		
		
		P146_Circle obj = new P146_Circle();
		
		obj.radius = 100;
		
		obj.color = "blue"; // 객체의 필드 접근
		
		obj.getArea(100); // 객체 메소드 접근
		String a = obj.color;
		
		System.out.println("원의 면적=" + obj.getArea);
		System.out.println("원의 색상=" + a);
	}
}
