package ProgramingTest;


public class star2 {
	public static void main(String[] args) {
		
		for(int x = 1; x <= 5; x++) {
			for(int y = 5; y > 0; y--) {
				if(x >= y) {
					System.out.print("★");
				}else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}
		
	}
}
