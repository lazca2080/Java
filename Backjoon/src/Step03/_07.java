package Step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 박종협
 * 내용 : 백준 3단계 7번 : A+B-8
 */
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int total = x+y;
			System.out.printf("Case #%d: %d + %d = %d\n",i, x, y, total);
		}
	}
}
