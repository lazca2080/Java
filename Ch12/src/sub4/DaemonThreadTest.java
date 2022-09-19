package sub4;

/*
 * 날짜 : 2022/09/19
 * 이름 : 박종협
 * 내용 : Daemon Thread 실습 하기 
 * 
 * 데몬스레드(Daemon)
 *  - 메인스레드를 보조하는 보조스레드
 *  - 메인스레드가 종료되면 보조스레드(데몬)도 같이 종료
 */
public class DaemonThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		SubThread st = new SubThread();
		st.setDaemon(true);
		
		st.start();
		
		for(int i=1; i<=10; i++) {
			Thread.sleep(1000);
			System.out.println("메인 스레드 실행...");
		}

		System.out.println("메인 스레드 종료...");
	}
}
