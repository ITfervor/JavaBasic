package kakao.itstudy.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class ExceptionHandling1 {
//	//이 메서드를 다른 곳에서 호출할 떄는 ArithmeticException 을 핸들링 해야함.
//	//실제로는 이 메서드 안에서 AritmeticException
//	public static void exception() {
//		int kor = 10;
//		int eng = 120;
//		if(kor > 100 || eng > 100) {
//			//강제로 예외를 발생시키는 
//			throw new ArithmeticException("점수는 100보다 작거나 같아야함.");
//		}
//		double avg = (kor + eng) /2;
//		System.out.println(avg);
//	}

	public static void main(String[] args) {

		String message = null;
		//br은 처리가 끝나면 자동으로 close()를 호출
		//jdk 1.7에서 추가된 문 
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			message = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(message);

//		exception();
//		
//		//Thread 클래스의 sleep이라는 메서드느 
//		//지정한 시간동안 현재 스레드의 수행을 중지하는 역할을 해주는 메서드이다.
//		//이 메서드를 사용할떄는 interrupted Exception을 처리해야한다.
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
