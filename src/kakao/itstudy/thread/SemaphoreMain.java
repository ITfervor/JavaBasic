package kakao.itstudy.thread;

import java.util.concurrent.Semaphore;

class SemaphoreThread implements Runnable{
	private Semaphore semaphore;
	private String message;
	
	public SemaphoreThread(Semaphore semaphore, String message) {
		this.message = message;
		this.semaphore = semaphore;
	}
	
	@Override
	public void run() {
		try {
			//공유자원을 사용하기 전에 호출
			semaphore.acquire();
			System.out.println(message);
			Thread.sleep(10000);
		}catch(Exception e) {
			System.out.println("예외발생");
		}
		semaphore.release();
	}
}

public class SemaphoreMain {

	public static void main(String[] args) {
		//동시에 실행 될수 있는 스레드의 개수를 설정하는클래스
		//동시에 여러개의 스레드가 수행 될 상황에서 
		//성능 저하를 막기 위해서 사용
		Semaphore semaphore = new Semaphore(3);
		new Thread(new SemaphoreThread(semaphore, "1")).start();
		new Thread(new SemaphoreThread(semaphore, "2")).start();
		new Thread(new SemaphoreThread(semaphore, "3")).start();
		new Thread(new SemaphoreThread(semaphore, "4")).start();

	}

}
