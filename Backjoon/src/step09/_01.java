package step09;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 박종협
 * 내용 : 백준 9단계 1번 : 팩토리얼
 */
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		System.out.println(factorial(N));
	}
	
	public static int factorial(int N) {
		
		if(N <= 1) {
			return 1;
		}
		return N * factorial(N-1);
	}
}
