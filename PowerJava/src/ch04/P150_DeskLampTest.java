package ch04;

public class P150_DeskLampTest {
	public static void main(String[] args) {

		P150_DeskLamp myLamp = new P150_DeskLamp();
		
		
		// 객체의 메소드를 호출하려면 도트 연산자인 .을 사용한다.
		myLamp.turnOn();
		System.out.println(myLamp);
		myLamp.turnOff();
		System.out.println(myLamp);
	}
}
