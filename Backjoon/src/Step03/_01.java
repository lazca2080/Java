package Step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 박종협
 * 내용 : 백준 3단계 1번 : 구구단
 */
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n; n<=9; ++n) {
			for(int m = 1; m<=9; m++) {
				int x = n*m;
				System.out.printf("%d * %d = %d\n", n, m, x);
			
			}
			break;
		}
	}
}
