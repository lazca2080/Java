package Step04;

import java.util.Scanner;

public class _03 {
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
		int j = sc.nextInt();
		
		int[] arr = {a, b, c, d, e, f, g, h, i, j};
		int tnum = 0;
		int count = 0;
		
		for(int x = 0; x<arr.length; x++) {
			if(tnum != arr[x]%42) {
				tnum = arr[x];
				count = x+1;
			}
		}
		System.out.println(count);
	}
}
