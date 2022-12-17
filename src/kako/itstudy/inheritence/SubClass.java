package kako.itstudy.inheritence;

//SuperClass를 상속받는 SubClass
public class SubClass extends SuperClass{
		public void subMethod() {
			System.out.println("SubCalss만의 메서드");
			
		}

		//메서드 오버라이딩 - 상의 클래스에 존재하는 메서드를 다시 정
		@Override 
		public void display() {
			System.out.println("하위 클래스의 메서드");
		}
}
