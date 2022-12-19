package kakao.itstudy.nestedclass;

public class InstanceInner {
	//내부 클래스의 특성에 static이 추가되면 
	//외부에서 인스턴스를 만들때클래스 이름.new 내부클래스 이름()의 형태로 가능
	//안드로이드에서 뷰의 이벤트를 처리하기 위한 인터페이스 들이 이런방식으로 설계됨.
	public static class Inner{
		public int score;
		//내부클래스에 static멤버가 존재하면 클래스의 특성에 static을 추가해주어야한다.
		public static int autoIncrement;
	}
}
