package sub1;

/*
 * 
 * 
 */
public class Car {
	
	// 속성
	String name;	//
	String color;	//클래스에서 선언한 변수
	int speed;		//
	
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
