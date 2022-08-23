package Step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 박종협
 * 내용 : 백준 2단계 6번 : 오븐 시계
 */
public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		if(m+n>60) {
			if(h>23) {
				System.out.print((h+1)-24);
				System.out.println((m+n)-60);
			}else {
				System.out.print(h+1);
				System.out.println((m+n)-60);
			}
		}else if(h==24) {
			System.out.print(h-24);
			System.out.println(m+n);
		}else {
			System.out.print(h);
			System.out.println(m+n);
		}
	}
}
