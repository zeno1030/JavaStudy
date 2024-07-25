package enumeration.ex3;

public class EnumRefMain {
	public static void main(String[] args) {
		System.out.println("Grade.BASIC.getClass() = " + Grade.BASIC.getClass());
		System.out.println("Grade.GOLD.getClass() = " + Grade.GOLD.getClass());
		System.out.println("Grade.DIAMOND.getClass() = " + Grade.DIAMOND.getClass());
	}
	private static String refValue(Object value) {
		return Integer.toHexString(System.identityHashCode(value));
	}
}
