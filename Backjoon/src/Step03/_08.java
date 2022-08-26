package Step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 박종협
 * 내용 : 백준 3단계 8번 : 별 찍기 -1
 */
public class _08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x = 1; x<=n; x++) {
				
			for(int y =1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
