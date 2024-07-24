package lang.wrapper;

public class WrapperUtilsMain {
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("10"); // wrapper 타입으로 반환
		int i3 = Integer.parseInt("10");    // 기본형으로 반환

		int compareResult = i1.compareTo(20);
		System.out.println("compareResult = " + compareResult);

		System.out.println("sum = " + Integer.sum(10, 20));
		System.out.println("Integer.min(10, 20) = " + Integer.min(10, 20));
		System.out.println("Integer.max(10, 20) = " + Integer.max(10, 20));

	}
}
