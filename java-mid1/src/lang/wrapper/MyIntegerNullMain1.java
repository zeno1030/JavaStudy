package lang.wrapper;

public class MyIntegerNullMain1 {
	public static void main(String[] args) {
		MyInteger[] intArr = {new MyInteger(1), new MyInteger(2), new MyInteger(3)};
		MyInteger value = findValue(intArr, 2);
		MyInteger value1 = findValue(intArr, 100);
		System.out.println("value = " + value);
		System.out.println("value1 = " + value1);
	}

	private static MyInteger findValue(MyInteger[] intArr, int target) {
		for (MyInteger myInteger : intArr) {
			if (myInteger.getValue() == target) {
				return myInteger;
			}
		}
		return null;
	}
}

