package Ch08;

class Circle1 {
	int radius;
	public Circle1(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle(r="+radius+")";
	}
}

public class CircleTest2 {
	public static void main(String[] args) {
		Circle1 obj = new Circle1(10);
		System.out.println(obj);
	}
}
