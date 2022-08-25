package sub2;

/*
 * 
 * 
 */
public class Car {
	
	// 속성
	private String name;	
	private String color;	
	private int speed;		
	
	
	// 생성자
	public Car(String name, String color, int speed) {
		//리턴타입이 없음, 클래스의 이름을 따라감
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	// Getter, Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 기능
	public void speedUp(int speed) {
						//지역변수
		this.speed += speed; //지역변수 speed이다. 따라서 class car의 speed를 참조해야하므로 this.를 붙인다. 
					//지역변수
		
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void Show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("현재속도 : "+speed);
	}
}
