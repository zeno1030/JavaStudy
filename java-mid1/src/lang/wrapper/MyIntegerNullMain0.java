package lang.wrapper;

public class MyIntegerNullMain0 {
	public static void main(String[] args) {
		int[] intArr = {-1, 0, 1, 2, 3};
		int value = findValue(intArr, 2);
		System.out.println("value = " + value);
	}

	private static int findValue(int[] intArr, int target) {
		for (int value : intArr) {
			if (value == target) {
				return value;
			}
		}
		return -1;
	}
}
