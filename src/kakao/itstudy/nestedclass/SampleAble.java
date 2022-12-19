package kakao.itstudy.nestedclass;

//인터페이스 안에 속성을 만들면 final변수가 된다.
//인터페이스 안에 메서드를 만들면 abstract method가 된다.
//인터페이스안에 메서드를 만들때 내용을 추가하고자 하면 default라는 키워드를 추가해야한다.
//인터페이스는 인스턴스 생성 못한다 . -변수 생성은 가능
//클래스에 implements해서 사용
public interface SampleAble {
	//자동으로 추상메서드가 된다ㅏ.
	//추싱메서드느 하위클래스에서 반드시 재정의를 해야한다.
	public void method();

}
