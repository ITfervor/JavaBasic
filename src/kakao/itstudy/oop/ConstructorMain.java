package kakao.itstudy.oop;

import java.util.Date;

public class ConstructorMain {
	public static void main() {
		// 인스턴스 생성
		Member member = new Member();
		member.setEmail("dlwjdduq0@gmail.com");
		member.setPassword("1234");
		member.setMarried(false);
		member.setAge(20);
		member.setBirthday(new Date());
		// 오늘 날짜
		// member.setBirthday(new Date(97, 3, 22));

		String[] nicknames = { "멋쟁", "정엽" };
		member.setNicknames(nicknames);

		System.out.println(member);
	}
}
