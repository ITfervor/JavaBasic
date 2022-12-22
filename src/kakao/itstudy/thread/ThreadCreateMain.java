package kakao.itstudy.thread;

//Thread 클래스로부터 상속받는 클래
class ThreadEx extends Thread {
	@Override
	public void run() {
		// 1초마다 스레드 이름을 10번 출력
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);// 작업이 너무 빨리 끝나므로 삽
				System.out.println(getName());
			} catch (Exception e) {

			}
		}
	}
}

public class ThreadCreateMain {

	public static void main(String[] args) {
		// 클래스를 상속받은 경우
		// 대부분의 경우는 변수를 만들 때는 상위 클래스 이름을 사용
		// 만약 ThreadEx에 없으면 Thread 에 가서 찾음 => ThreadEx가 Thread에 상속 되어있으므
		Thread th1 = new ThreadEx();
		th1.start();

		// anonymous 클래스 사용
		Runnable r = new Runnable() {
			public void run() {
				// 1초마다 i값 을 10번 출력
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println(i);
					} catch (Exception e) {
					}
					;

				}
			}

		};
		Thread th2 = new Thread(r);
		th2.start();
	}
}
