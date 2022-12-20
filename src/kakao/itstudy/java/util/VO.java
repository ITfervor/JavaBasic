package kakao.itstudy.java.util;

//크기 비교가 가능한메서드가 있다는 것을 
public class VO implements Comparable<VO>{
	private int num;
	private String name;
	private int age;
	public VO(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	public VO() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "VO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	//크기 비교하는 메서드
	//양수를 리턴하면 순서가 변경이 되고 0이나 음수를 ㄹ리턴하면 순서 변경이 안됨.
	@Override
	public int compareTo(VO o) {
		//숫자는 뺄셈을 해서 리턴하면 된다.
		//순서를 변경하면 내림차순이 된다.
		//return this.age - o.age;
		
		//문자열은 뺄셈이 안됨
		//문자열은 Comparable 인터페이스를 implements 했기 떄문에
		//compareTo 메서드로 비교하면 된다.
		return this.name.compareTo(o.name);
	}
}
