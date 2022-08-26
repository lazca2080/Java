package step09;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 박종협
 * 내용 : 백준 9단계 2번 : 피보나치 수 5
 */
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fibo(n));
	}
	
	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
}
