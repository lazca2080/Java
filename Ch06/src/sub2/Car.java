package sub2;

public interface Car {

	//private Sting name; 속성을 가질 수 없음
	//오직 추상 메서드만 선언 가능
	public void speedUp(int speed);
		//인터페이스에서 생성했음으로 abstract 생략
	public void speedDown(int speed);
	public void Show();
}
