package Step07;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 박종협
 * 내용 : 백준 7단계 1번 : 손익분기점 
 */
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int n = 0;
		
		if(B >= C) {
			n = -1;
		}else {
			n = A/(C-B)+1;
		}
		System.out.println(n);
	}
}
