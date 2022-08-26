package ch04;

public class P151_BoxTest {
	public static void main(String[] args) {
		
		P151_Box vol = new P151_Box();
		
		vol.height = 20;
		vol.length = 20;
		vol.width = 30;
		
		System.out.println("상자의 가로, 세로, 높이는 "+vol.height+" ,"+vol.length+", "+vol.width+"입니다.");
		System.out.println("상자의 부피는 " + vol.volume() + "입니다.");
		
	}
}
