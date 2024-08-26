package generic.ex1;

public class BoxMain1 {
	public static void main(String[] args) {
		IntegerBox integerBox = new IntegerBox();
		integerBox.setValue(10);
		Integer value = integerBox.getValue();

		System.out.println("value = " + value);

		StringBox stringBox = new StringBox();
		stringBox.setValue("Hello");
		String stringValue = stringBox.getValue();
		System.out.println("stringValue = " + stringValue);

	}
}
