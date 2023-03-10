package kako.itstudy.inheritence;

public class Super {
	private int num; // 상속은 되지만 하위클래스에서 접근이 안됨.
	protected String name;
	
	public Super() {}
	
	public Super(int num, String name) {
		this.num = num;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "super [num=" + num + ", name=" + name + "]";
	}
	
}
