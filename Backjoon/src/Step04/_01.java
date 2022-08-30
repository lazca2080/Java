package Step04;

/*
 * 날짜 : 2022/08/30
 * 이름 : 박종협
 * 내용 : 백준 4단계 1번 : 최소, 최대
 */
import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0; i<=N-1; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		
		int Minnum = arr[0];
		
		for(int y = 0; y<=N-1; y++) {
			if(Minnum > arr[y]) {
				Minnum = arr[y];			
			}
		}
			System.out.print(Minnum+" ");
		
		int Maxnum = arr[0];		
		
		for(int x = 0; x<=N-1; x++) {
			if(Maxnum < arr[x]) {
				Maxnum = arr[x];
			}
		}
		    System.out.println(Maxnum);
	}
}
