package kakao.itstudy.java.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//데이터 클래스 - VO
class VO1 {
	private int number;
	private String name;
	

@Override
	public String toString() {
		return "VO1 [number=" + number + ", name=" + name + "]";
	}


public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


public VO1(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

}
public class MapMain{
	public static void main(String[] args) {
		VO1 vo = new VO1(1,"adam");
		
		//데이터 출력 - view
		//모델의 근원이 되는 VO클래스 안에 속성이름을 변경하면 
		//view도 수정이 되어야한다.
		//관계형 데이터베이스는 VO클래스를 활
//		System.out.println("번호: " +  vo.getNum() );
//		System.out.println("이름: " + vo.getName() );
		
		//VO클래스의 인스턴스 역할을 수행하는 Map을 생성
		Map <String, Object> map = new HashMap<>();
		
		map.put("번호", 1); //(key, value)
		map.put("name", "adam");
		
		//map의 모든 키를 가져와서 출력
		Set<String> keys = map.keySet();
		for(String key :  keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}

