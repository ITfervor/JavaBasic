package kakao.itstudy.java.lang;

import java.io.IOException;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
//		
//		String []nicknames = {"adam" , "wjdduq", "덜"};
//		//인스턴스 생성
//		Data original = new Data(1, "itstudy", nicknames);
//		//인스턴스의 참조복사
//		//참조대상이나 원본이 내부 데이터를 변경하면 영향을 준다.
//		Data data = original;
//		System.out.println(original);
//		data.setNum(2);
//		System.out.println(original);
//		
//		//자바는 복제를 이용하고자 하는 경우 clone메서드를 재정의 해야한다.
//		//재정의 할 때 Cloneable인터페이스를 implements하기를 권장한다.
//		
//		Data copy = original.clone();
//		System.out.println(original);
//		copy.setNum(3);
//		System.out.println(original);
//		
//		Data data1 = new Data(1, "kakao", null);
//		Data data2 = new Data(1, "kakao", null);
//		
//		
//		System.out.println(data1 == data2);
//		//재정의 하지 않아서 false
//		System.out.println(data.equals(data2));
//		
//		Wrapper 클래스 사
		Double d = new Double(13.67);
		d = 17.23;//기본형으로 대입하면 new Double(17.23)으로 변환
		/**
		//재정의 되어있으므로 출력은 참조가능
		System.out.println(d);
		
		//기본형 데이터로 변
		double x = d;
		System.out.println(x);
		
		double d1 = 1.600000000000000000;
		double d2 = 0.100000000000000000;
		
		System.out.println(d1 + d2);
		
		BigDecimal b1 = new BigDecimal("1.600000000000000000");
		BigDecimal b2 = new BigDecimal("0.100000000000000000");
		
		System.out.println(b1.add(b2));
		**/
		
		/**
		String str = "Hello";
		System.out.println(System.identityHashCode(str));
		//String의 데이터 수정이 안되기 때문
		//새로운 공간에 기존의 문자열을 복사 한후 작업을 수행하고
		//그 참조를 다시 리턴
		//기존의 데이터가 저장된 공간은 메모리가 낭비 될수 잇음.
		
		str+="Java";
		System.out.println(System.identityHashCode(str));
		
		//변경 가능한 문자열을 저장

*/
//	//여러 데이터를 가지고 하나의 문자열을 생성
//		double lat =12.789;
//		double lng = 24.123;
//		
//		//위의 데이터를 가지고 위도12789, 도 24123문자열로 생성
//		String msg = String.format("위도:%.3f 경도:%.3f", lat, lng);
//		System.out.println(msg);
		
		/*
		//운영체제 이름 가져오기
		String os = System.getProperty("os.name");
		//자바 버전확인
		String version = System.getProperty("java.version");
		System.out.println(os);
		System.out.println(version);
		*/
		
		//Runtime 클래스의 인스턴스 생성
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		
		//singleton패턴으로 디자인돼서 해시코드가 동일
		System.out.println(System.identityHashCode(r2));
		System.out.println(System.identityHashCode(r1));
	
		//프로세스 실행
		/*try {
			r1.exec("open");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		/*
		int [] ar = new int[1000000];
		
		long start = System.currentTimeMillis();
		for(int i = 0; i <ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println((end-start) + " 밀리 초");
		
		*/
		
		//Generics가 적용된 클래스의 인스턴스를 만들 때는
		//실제 자료형을 결정지어야 경고가 발생하지 않는다.
		
		/*
		Generic <String> obj1 = new Generic<> ("gogo" , "hunts", "doran");
		obj1.disp();
		//java의 기본형은 Generics 에 적용할수 없다.
		Generic<Integer> obj2 = new Generic<>(100,200,30);
		obj2.disp();
		*/
		
		
		
	}
	
	
	

}
