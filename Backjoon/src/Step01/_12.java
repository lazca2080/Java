package Step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 박종협
 * 내용 : 백준 1단계 12번 : 곱셈
 */
public class _12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a*(b%10);			//1의 자리숫자
		int d = a*((b%100)/10);		//10의 자리숫자
		int e = a*(b/100);			//100의 자리숫자
		int f = a*b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
