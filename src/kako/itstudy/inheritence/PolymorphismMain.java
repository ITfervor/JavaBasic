package kako.itstudy.inheritence;

public class PolymorphismMain {

	public static void main(String[] args) {
		//변수를 선언할 때 사용한 클래스 와
		//인스턴스를 생성하기 위해 호출한 클래스가 동일 - 가능
		SuperClass superClass = new SuperClass();
		//superClass 변수가 호출 할 수 있는 것은 SuperClass의 것들만 가능
		superClass.SuperMethod();
		superClass.display();
		
		
		//변수를 선언할때 사용한 클래스와 
		//인스턴스를 생성하기 위해서 호출하는 클래스가 상속관계이면
		//가능- 인스턴스를 생성하기 위해서 호출하는클래스가 하위 클래스
		SuperClass subClass = new SubClass();
		//subClass는 선언할 떄는 SuperClass인데
		//인스턴스는Subclass로 생성
		//호출할수 있는 것은 SuperClass를 참조하지만
		//호출 되는 것은 SubClass의 것이다.
		subClass.SuperMethod(); //overriding이 안된 메서
		subClass.display(); ///overriding이 된 메서드
		//subclass메서드 호출
		
		SuperClass obj = new SuperClass();
		//대입된 인스턴스가 SuperClass의 인스턴스
		//SuperClass의display가 호출 됨
		obj.display();
		
		obj = new SubClass();
		//대입된 인스턴스가 SubClass의 인스턴스
		//SubClass의 display가 호출됨.
		obj.display();
	}

}
