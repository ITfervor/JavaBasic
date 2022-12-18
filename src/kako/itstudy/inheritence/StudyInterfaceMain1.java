package kako.itstudy.inheritence;

public class StudyInterfaceMain1 {
	public static void main(String args[]) {
		StudyInterImpl obj = new StudyInterImpl();
		// obj.a = 200;
		obj.method2();
		System.out.println("인터페이스에서는 final을 사용하지 않아도 변수는 final");
		System.out.println("인터페이스에서는 abstract을 사용하지 않아도 메서드는 abstract");
	}
}
