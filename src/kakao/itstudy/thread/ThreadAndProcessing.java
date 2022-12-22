package kakao.itstudy.thread;

public class ThreadAndProcessing {

	public static void main(String[] args) {
		// 스레드를 사용하지않은 경우
		new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println(i);

					} catch (Exception e) {

					}
				}
			}
		}.start();
		new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println(i);

					} catch (Exception e) {

					}
				}
			}
		}.start();
	
	
	}

}
