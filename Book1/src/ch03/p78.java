package ch03;

/*
 * 날짜 : 2022/08/18
 * 이름 : 박종협
 * 내용 : 단락 회로 평가 실습하기
 */
public class p78 {
	public static void main(String [ ] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i +2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) < 10) || ((i = i +2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		//논리 곱 연산과 논리 합 연산을 할 때 두 항을 모두 실행하지 않더라도 결과 값을
		//알 수 있는 경우에, 나머지 항은 실행되지 않는 것을 단락 회로 평가(SCE)라 한다.
	}

}
