package Step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 박종협
 * 내용 : 백준 3단계 10번 : x보다 작은 수
 */
public class _10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		
		for(int y = 1; y<=N; y++) {
			 int a = sc.nextInt();
			 if(x > a) {
				 System.out.print(a+" ");
			 }
		}
	}
}
