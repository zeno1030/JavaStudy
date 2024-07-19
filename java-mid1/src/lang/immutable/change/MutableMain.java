package lang.immutable.change;

public class MutableMain {
	public static void main(String[] args) {
		MutableObject a = new MutableObject(10);
		a.add(20);
		System.out.println("a.getValue() = " + a.getValue());
	}
}
