package kakao.itstudy.java.lang;

import java.util.Arrays;
import java.util.Objects;

//하나의 데이터 묶음을 표현하기 위한 클래스 - VO
public class Data implements Cloneable {
	
	private int num;
	private String name;
	private String [] nicknames;
	public Data() {
		super();
	}
	//속성을 대입받아서 생성하는 생성자
	//인스턴스를 빠르게 초기화하기 위해서 사
	public Data(int num, String name, String[] nicknames) {
		super();
		this.num = num;
		this.name = name;
		this.nicknames = nicknames;
	}
	
	//접근자 메서드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getNicknames() {
		return nicknames;
	}
	public void setNicknames(String[] nicknames) {
		this.nicknames = nicknames;
	}
	//인스턴스의 내용을 빠르게 만들기 위해
	//디버깅을 위한 메서드
	@Override
	public String toString() {
		return "Data [num=" + num + ", name=" + name + ", nicknames=" + Arrays.toString(nicknames) + "]";
	}
	//복제를 위한 메서드
	public Data clone(){
		Data data = new Data();
		//이 방식은 얕은 복사(weak copy);
		//num은 숫자 데이터이므로 바로 복제가능
		//name 와 nicknames는 숫자데이터 아니다.
		//바로 대입하면 참조가 대입 된다.
		data.setNum(this.num);
		data.setName(this.name);
		data.setNicknames(this.nicknames);
		
		return data;
	}
	//데이터의 내용이 같은지 확인하는 메서드
	public boolean equals(Object other) {
			boolean result = false;
			//원래 자료형으로 변환
			Data other1 = (Data)other;
			if(this.num == other1.getNum() && this.name.equals(other1.getName())){
				return true;
			}
			
			//Objects.hash(데이터 나열)을 이용하면
			//데이터를 가지고 정수로 만든 해시코드를 생성
			System.out.println(Objects.hash(num,name));
			System.out.println(Objects.hash(other1.getNum() ,other1.getName()));
			
			return result;
					
	}
}
