package kakao.itstudy.nestedclass;

public class Main {
	public static void main(String[] args) {
		// 외부클래스의 인스턴스를 생성
		// InstanceInner instanceInner = new InstanceInner();
		// 내부클래스 인스턴스 생성 - Local Inner인 경우
//		InstanceInner.Inner inner = instanceInner.new Inner();

		// static Inner class의 인스턴스 생성
		InstanceInner.Inner obj = new InstanceInner.Inner();
		
		//인스턴스 생성
		//인테페이스나 추상클래스 등을 상속해서 클래스를만들고 
		//인스턴스를 만드는경우 변수는 대부분 인터페이스나 추상클래스 이름으로 맍들고
		//생성자는 사용하고자 하는 클래스의 생성자를 이용하는 경우가 많다.
		//상위클래스나 인터페이스로 만들어진 변수에 하위클래스의 인스턴스를 참조대입가능
		//이렇게 만들어진 변수는 상위클래스나 인터페이스에 존재히는 이름만 호출이 가능하다.
		//실제 호출되는 것은 생성자를 따라간다.
//		SampleAble instance = new SampleAble() {
//
//			@Override
//			public void method() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
//		
//		//메서드 호출
//		instance.method();
	
		SampleAble anonymous = new SampleAble() {

			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("anonymou 이");
			}
			
		};anonymous.method();
		
		//메서드를 1번만 호출할 거하면 변수를 생성하지 않고 가능
		new SampleAble() {

			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("변수를 만들지 않고 Anonympus 사용가");
			}
	}.method();;
	//public 클래스에 public static 속성은 어느곳에서나 호출가
	GlobalData.global = 10;
	
	//디자인 패턴이 적용되지 않은 경우의 인스턴스 생성 ->해시코드 값이 다르게 출력이 됨.
//	Singleton singleton1 = new Singleton();
//	Singleton singleton2 = new Singleton();
	
	//싱글톤 턴으로 디자인이 된 클래스의 인스턴스 생성
	Singleton singleton1 = Singleton.sharedInstance();
	Singleton singleton2 = Singleton.sharedInstance();
	
	//해시코드 확인
	System.out.println(System.identityHashCode(singleton2));
	System.out.println(System.identityHashCode(singleton1));
	
	
	Table row1 = new Table();
	System.out.println(row1.getNum()); //get은 값 읽어 오는것
	Table row2 = new Table();
	System.out.println(row2.getNum());
	Table.setStep(10);//set은 입력값 수정
	Table row3 = new Table();
	System.out.println(row3.getNum());
	
	
	
	
	
	}
}
