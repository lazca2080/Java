package Step06;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 박종협
 * 내용 : 백준 5단계 2번 : 숫자의 합
 */
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String num = sc.next();
		int sum = 0;
		
		for(int x = 0; x<N; x++) {
			sum +=num.charAt(x)-48;
			
		}
		System.out.println(sum);
	}
}
