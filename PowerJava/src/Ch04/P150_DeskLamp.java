package Ch04;
	
public class P150_DeskLamp {
	//인스턴스 변수 정의
	private boolean isOn;
	
	//메소드 정의
	public void turnOn() { isOn = true; }
	public void turnOff() { isOn = false; }
	public String toString() {
		return"현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
	}
}
