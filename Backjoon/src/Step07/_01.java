package Step07;

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int n = 0;
		
		while(true) {
			n++;
			if(A+B*n < C*n) {
				break;
			}else if(n > 2100000001) {
				n = -1;
			}else {
				
			}
		}
		System.out.println(n);
	}
}
