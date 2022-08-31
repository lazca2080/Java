package Step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/30
 * 이름 : 박종협
 * 내용 : 백준 4단계 2번 : 최대값
 */
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		int h = sc.nextInt();
		int i = sc.nextInt();
		
		int[] arr = {a, b, c, d, e, f, g, h, i};
		int maxnum = 0;
		int count = 0;
		
		for(int x = 0; x<arr.length; x++) {
			if(maxnum < arr[x]) {
				maxnum = arr[x];
				count = x+1;
			}
		}
		System.out.println(maxnum);
		System.out.println(count);
	}
}
