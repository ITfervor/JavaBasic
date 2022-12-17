package kakao.itstudy.oop;

public class Main {

	public static void main(String[] args) {
		// Student 클래스의 인스턴스 생성
//		Student student = new Student();
//		student.num = 1;
//		student.name="아이린";
//		student.kor=32;
//		student.eng=19;
//		student.mat = 40;
//		
//		Student student1 = new Student();
//		student1.num = 2;
//		System.out.println(student.num);
//		System.out.println(student1.num);
//		
//		//자바는 static속성에 인스턴스가 접근
//		student.schoolName = "명덕고등학교";
//		student1.schoolName = "제일중학교";
//		//static 속성은 모든 인스턴스가 공유하므로
//		//동일한 데이터가출력된다
//		System.out.println(student.schoolName);
//		System.out.println(student1.schoolName);
//		
//		final int x = 10;
//		//클래스 안에서는 public final int x; 가능(생성자 만들어 줘야함.) 
		
		//static 메서드는 클래스이름 호출가능
//		MethodClass.method1();
		//클래 이름을 가지고 메서드 호출 불가
//		MethodClass.method2();
		
		//인스턴스 메서드 호출
//		MethodClass methodClass = new MethodClass();
//		methodClass.method2();
		//자바는 인스턴스를 이용해서 static메서드 호출 가능
//		methodClass.method1();
		
		MethodClass obj =new MethodClass();
		int result = obj.addWithInteger(10, 30);
		System.out.println("결과" + result );
		//리턴된 결과를 가지고 다른 작업을 수행 할수 잇다.
		
		int x = 10;
		MethodClass.callByValue(x);
		//기본형을 메서드에게 넘겨준 경우는 데이터가 변경되지 않음
		System.out.println(("x : " + x));
		
		int []br = {10, 20, 30};
		MethodClass.callByReference(br);
		//배열을 메서드에게 넘기면 배열의 내용이 변경될 수도 있음
		//메서드의 리턴이 없는 경우라면 print를 제외하고는
		//원본ㅇㄹ 변경해주는 것이다.
		System.out.println("br[0] : " + br[0] );
		
		MethodClass o1 = new MethodClass();
		o1.thisMethod();
		
		int f = MethodClass.noRecursionFibonacci(50);
		System.out.println("f :" + f );
		
		 f = MethodClass.recursionFibonacci(5);
		System.out.println("f :" + f );
		
		//display 메서드의 매개변수가 String ...args이므로
		//문자열을 몇개 주어도 상관없다.
		MethodClass.display("good");
		MethodClass.display("yes", "no");
			
	}

}

