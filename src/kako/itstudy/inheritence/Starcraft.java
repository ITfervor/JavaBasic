package kako.itstudy.inheritence;

//protoss, zerg, terran 클래스의 인스턴스를 
//하나의 변수에 대입 할수 있도록 하기 위한 상위 클래
public interface Starcraft {
	//오버라이딩을 위해서 생성한 메서드
	//추상메서드는 추상클래스나 인터페이스에만 존재할수 있음.
	
	public abstract void attack();
	
}
