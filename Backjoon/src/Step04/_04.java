package Step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/01
 * 이름 : 박종협
 * 내용 : 백준 4단계 4번 : 평균
 */
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		
		for(int i = 1; i<N; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		
		int Maxnum = arr[0];
		
		for(int x = 0; x<arr.length; x++) {
			if(Maxnum < arr[x]) {
				Maxnum = arr[x];
			}
			
			
		}
		

	}
}
