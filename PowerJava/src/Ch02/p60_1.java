package Ch02;

/*
 * 날짜 : 2022/08/26 
 * 이름 : 박종협
 * 내용 : 1광년 거리 계산하기
 */
public class p60_1 {
	public static void main(String[] args) {
		final double LIGHT_SPEED = 3e5;
		double distance;
		
		distance = LIGHT_SPEED * 365 * 24 * 60 * 60;
		System.out.println("빛이 1년 동안 가는 거리 : " + distance + " km. ");
	}
}
