package kakao.itstudy.oop;

public class Date {
	private static int sequence;
	static {
		sequence = 0;
	}
	
	private int num;
	private String name;
	
	public Date() {
		super();
		//sequence를 num에 대입하고 1 증가
		num = sequence++;
	}
	
	public Date(String name) {
		super();
		this.num = ++sequence;
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
	
	
}
