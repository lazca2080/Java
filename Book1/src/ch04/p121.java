package ch04;

public class p121 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) {
			sum += num;
			if(sum >= 100)
				break;
		}
		System.out.println("num : " + num);
		System.out.println("sum : "+sum);
	}
}
