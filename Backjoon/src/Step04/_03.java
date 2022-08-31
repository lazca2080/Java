package Step04;

import java.util.Arrays;
import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int a1 = a % 42;
		int b = sc.nextInt();
		int b1 = b % 42;
		int c = sc.nextInt();
		int c1 = c % 42;
		int d = sc.nextInt();
		int d1 = d % 42;
		int e = sc.nextInt();
		int e1 = e % 42;
		int f = sc.nextInt();
		int f1 = f % 42;
		int g = sc.nextInt();
		int g1 = g % 42;
		int h = sc.nextInt();
		int h1 = h % 42;
		int i = sc.nextInt();
		int i1 = i % 42;
		int j = sc.nextInt();
		int j1 = j % 42;
				
		int arr[] = {a1, b1, c1, d1, e1, f1, g1, h1, i1, j1};
		Arrays.sort(arr);
		int cnum = arr[0];
		int count = 1;
		
		for(int x = 1; x<arr.length; x++) {
			if(cnum == arr[x]) {
				cnum = arr[x];
			}else {
				cnum = arr[x];
				count += 1;
			}
		}
		System.out.println(count);
	}
}
