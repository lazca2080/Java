package ch04;

public class CircleTest {
	public static void main(String[] args) {
		
		//Circle obj;
		
		//obj = new Circle();
		
		
		Circle obj = new Circle();
		
		obj.radius = 100;
		
		obj.color = "blue"; // 객체의 필드 접근
		
		double area = obj.getArea(); // 객체 메소드 접근
		String a = obj.color;
		
		System.out.println("원의 면적=" + area);
		System.out.println("원의 색상=" + a);
	}
}
