package Step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/01
 * 이름 : 박종협
 * 내용 : 백준 4단계 6번 : 평균은 넘겠지
 */
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int sum = 0;
		int avg = 0;
		int count = 0;
		
		for(int x = 0; x<C; x++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int y = 0; y<N; y++) {
				int i = sc.nextInt();
				arr[y] = i;
				sum += i;
				
			}
			for(int a = 0; a<arr.length; a++) {
				avg = sum/N;
				if(avg < arr[a]) {
					count ++;
				} 
			}
			float a1 = (float)count/N*100;
			System.out.println(String.format("%.3f", a1)+"%");
			sum = 0;
			avg = 0;
			count = 0;
		}
	}
}
