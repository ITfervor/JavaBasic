package kakao.itstudy.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		try{System.out.println(i/j);
		//catch가 여러개이면 일치하는 catch 블럭의 내용을 처리하고
		//다른 catch는 모두 pass
		//상위 클래스 참조형 변수에는 하위  클래스 인스턴스 참조를 저장할수 있기 때문
		//catch를 여러개 쓸때 주의 해야한다.
		//상위 클래스의 예외처리 구문을 먼저 만들고
		//아래에 하위클래스의 예외처리 구문을 만들면 컴파일 에러
		//아래 예외처리구문이 dead code가 됨.
		}catch(NullPointerException e) { //exception e 는 상위 클래스 에러이므로 사용시 밑에 있는 예외가 오류
			System.out.println("널 속성이나 메서드를 호출하면 예외 발생");
		}
		catch(ArithmeticException e) {
			//예외가 발생했을때 실행할 내용
			System.out.println("0으로 나누면 안됩니다.");
		}finally {
			//예외 발생여부에상관없이 수행
			System.out.println("예외발생여부에 상관없이 수행");
		}
		
	}

}
