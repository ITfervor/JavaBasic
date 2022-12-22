package kakao.itstudy.thread;

public class ThreadMain {
	public static void main(String[] args) {
		Thread th1 = new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
						System.out.println(getName());
					} catch (Exception e) {

					}
				}
			}
		};
		th1.start();

		// NullPointerException 예외 발생
		// Demon이 아닌 스레드는다른 스레드가 중지되더라도 계속 동
//		String str = null;
//		System.out.println(str.trim());

		Thread th2 = new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
						System.out.println(getName());
					} catch (Exception e) {

					}
				}
			}
		};

		Thread th3 = new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
						System.out.println(getName());
					} catch (Exception e) {

					}
				}
			}
		};
		// 스레드의 우선 순위 설정
		th2.setPriority(Thread.MIN_PRIORITY);
		th3.setPriority(Thread.MAX_PRIORITY);
		
		th2.start();
		th3.start();

	}
}
