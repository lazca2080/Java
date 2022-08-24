package Step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 박종협
 * 내용 : 백준 2단계 7번 : 주사위 세개
 */
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b && a==c) {
			System.out.println(10000+a*1000);
		}else if(a==b && a!=c) {
			System.out.println(1000+a*100);
		}else if(a==c && a!=b) {
			System.out.println(1000+a*100);
		}else if(b==c && a!=b) {
			System.out.println(1000+b*100);
		}else {
			int max = a;
			if(max < b) {
				max = b;
			}
			if(max < c) {
				max = c;
			}
				System.out.println(max*100);
		}		
	}
}
