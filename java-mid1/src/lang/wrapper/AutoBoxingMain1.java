package lang.wrapper;

public class AutoBoxingMain1 {
	public static void main(String[] args) {
		//Primitive -> Wrapper
		int value = 7;
		Integer boxValue = Integer.valueOf(value);

		//Wrapper -> Primitive
		int unboxedValue = boxValue.intValue();

		System.out.println("boxValue = " + boxValue);
		System.out.println("unboxedValue = " + unboxedValue);
	}
}
