package kakao.itstudy.oop;

import java.util.Date;



public class Member {
	private String email;
	private String password;
	private String [] nicknames;
	private Date birthday;
	private boolean married;
	private int age;
	
	
	//모든속성을매개변수로 받아서 초기화 해주는 생성자 
	public Member(String email, String password, String[] nicknames, Date birthday, boolean married, int age) {
		super();
		this.email = email;
		this.password = password;
		this.nicknames = nicknames;
		this.birthday = birthday;
		this.married = married;
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[] getNicknames() {
		return nicknames;
	}
	public void setNicknames(String[] nicknames) {
		this.nicknames = nicknames;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//속성에 배열이나 List와 같은컬렉션이 있을떄는 컬랙셔내에서 하나의 데이터만 읽고 슬수 있는 메서드를 제공해주는것이 좋다
	
	public String getNickname(int index) {
		return nicknames[index];
	}
	
	public void setNickname(int index, String nickname) {
		nicknames[index] = nickname;
	}
	
	
	
	//모든것의 toString을 호출해서하나의 문자열로 만들어주는 메서드
	//디버깅(값을 확인하는 작업)을 위해서 호출하는 메서드
	@Override
	public String toString() {
		return "Member [ email=" + email + ", password "+ password +", nicknames" + nicknames + 
				" ,birthday" + birthday + ", merried" + married + ", age]" + age; 
	}
	
	
}
