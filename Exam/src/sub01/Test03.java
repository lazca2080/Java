package sub01;

/*
 * 날짜 : 2022/08/19
 * 이름 : 박종협
 * 내용 : 자바 연산자 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		int num = 1;
		int result = 0;
		
		result = num++;
		// 대입이 먼저 일어나고 num이++가 된다.
		System.out.println("result : "+result);

		result = ++num;
		// 연산이 먼저 일어나고 대입이 된다.
		System.out.println("result : "+result);
		
		result = num--;
		// 대입이 먼저 일어나고 연산이 된다.
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
		
	}
}
