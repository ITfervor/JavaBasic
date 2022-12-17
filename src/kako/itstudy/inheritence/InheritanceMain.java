package kako.itstudy.inheritence;

public class InheritanceMain {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.setNum(1);
		sub.setName("good");
		sub.setNickname("카카오");
		
		System.out.println(sub);
		Super s1 = new Super();
		Sub s2 = new Sub();
		
		//상위 클래스 타입의 참조형 변수에는 하위 클래스 타입의
		//인스턴스 참조를 배로 대입할수 있다.
		Super s3 = new Sub();
		
		//하위 클래스 타입의 참조형 변수에는 상위 클래스타입의 
		//인스턴스 참조를 대입할수 없다
		//강제 형 변환하면 가능 
		//Sub s4 = new Super();
		
		//강제 형 변환
		//s3에 대입된 인스턴스는 원래 Sub 타입이어서 문제 없다.
		Sub s4 = (Sub)s3;
		
		//원래 자료형이 Super이기 때문에 예외 발생
		Sub s5 = (Sub)(new Super());
		}
	
}
