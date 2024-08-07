package nested.nested.anonymous.ex;

public class Ex0RefMain {

	public static void hello(String type) {
		System.out.println("프로그램시작");
		System.out.println(type);
		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		hello("Hello Java");
		hello("Hello Spring");
	}
}
