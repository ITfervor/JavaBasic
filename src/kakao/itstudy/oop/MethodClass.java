package kakao.itstudy.oop;

public class MethodClass {
//		private static int num;
//		private String name;
//		//static method
//		public static void method1() {
//			System.out.println("static method");
//			num = 1;
//			//static 메서드에서는 instance 속성이 안됨
//			//name = "adam";
//		}
//		
//		//instance method
//		public void method2() {
//			//this가 있기때문 둘다 사용가
//			num = 1;
//			name = "adam";
//			System.out.println("instnce method");
	
			//static : 인스턴스를 생성할 필요가 없음
			//매개변수가 없음
			//MethodClass.noArgsMethod
			
	
			//static 있나없나 확인하기 > 인스턴스.addWithInteger(정수1, 정수2)
			public int addWithInteger(int first, int second) {
				//2개의 매개변수를 더한 결과를 리
				return(first+second);
				}
			//메서드 오버로딩
			public void display() {
				
			}
			//매개변수의 개수가 달라서오버로딩
			public void display(int a) {
				
			}
			//매개변수의 개수는 같지만 자료형이 달라서 오버로딩
			//**매개변수의 이름이 다른것은 상관이 없다.
			//*리턴 타입이 다른것 또한 상관이 없다.
			public void display(double a) {
				
			}
			
			//매개변수가 기본형 1개
			//내부에서 매개변수의 값을수정해 념겨준 데이터는 변경되지 않음
			public static void callByValue(int n) {
				n = n + 1;
				System.out.println("n : " + n);
				
				
			}
			
			//매개변수가 참조형인 경우
			public static void callByReference(int []ar) {
				ar[0] = ar[0] + 1;
				System.out.println("ar[0] : " + ar[0]);
			}
			
			public int score = 100;
			
			public void thisMethod() {
				int score = 200;
				//scope의 법칙 적용 - 가까이에서 만든 것을 사용
				System.out.println("score : " + score); // 200
				//인스턴스가 가진 score호출
				//**this가 붙으면 메서드 안에서 찾지않는다
				System.out.println("this.score:" + this.score);
			}
			
			public static int noRecursionFibonacci(int n) {
				int n_1 = 1; // 현재 구하고자 하는 피보나치 값의 바로 앞
				int n_2 = 1; // 현재 구하고자 하는 피보나치 값의 두번째 
				//기본값 설정
				int fibo = 1;
				//규칙이 3번째 부터 적용
				int i = 3;
				
				while(i<=n) {
					fibo = n_1 + n_2;
					
					//n_1과 n_2를 이동
					n_2 = n_1;
					n_1 = fibo;
					
					i = i + 1;
				}
				return fibo;
			}
			//재귀를 이용한 피보나치 수
			public static int recursionFibonacci(int b) {
				if(b == 1 || b == 2) {
					return 1;
				}
				return recursionFibonacci(b-1)+
						recursionFibonacci(b-2);
			}
			
			//매개변수의 개수를 가변으로 설정 -> int로 한번 해보
			public static void display(String ...args) {
				for(String temp : args) {
					System.out.println(temp);
				}
			}
			
			
			
}
		
