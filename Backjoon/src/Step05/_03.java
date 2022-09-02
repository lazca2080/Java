package Step05;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int S1;
		int a = S.length();
		int count = 1;
		int num = 0;
		
		for(int x = 0; x<a; x++) {
			S1 = S.charAt(x);
			for(int y = 0; y<=25; y++) {
				if(y == S.charAt(x)-97) {
					break;
				}else {
					count++;
				}
			}System.out.println(count);
			
		
		}		
		
	}
}
