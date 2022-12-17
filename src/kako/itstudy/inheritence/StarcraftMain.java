package kako.itstudy.inheritence;

public class StarcraftMain {

	public static void main(String[] args) {
		
		

		
		//프로토스 공격
		Starcraft star = new Protoss();
		star.attack();
		
		//저그 공격
		star = new Zerg();
		star.attack();
		
		//테란 공격
		star = new Terran();
		star.attack();
		
		//추상 클래스는 인스턴스를 생성할수 없기 때문에\
		//new 를 할수 없어서 에러
		//star = new Starcraft();
		//star.attack();
	}


}
