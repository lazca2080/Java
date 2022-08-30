package Step04;

import java.util.Scanner;

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
		
		int Maxnum = arr[0];
		int start = 0;
		int end = arr.length;
		int x = 1;
		int count = 0;
		
		while(start<=end) {
			if(Maxnum < arr[x]) {
				Maxnum = arr[x];
				x++;
				count++;
			}else if(Maxnum > arr[x]) {
				break;
			}
		}
			
		System.out.println(Maxnum);
		
	}
}
