package lang.wrapper;

public class WrapperClassMain {
	public static void main(String[] args) {
		Integer newInteger = new Integer(10); //미래에 삭제 예정, valueOf()를 사용
		Integer integerObj = Integer.valueOf(10);
		System.out.println("newInteger = " + newInteger);
		System.out.println("integerObj = " + integerObj);
	}
}
