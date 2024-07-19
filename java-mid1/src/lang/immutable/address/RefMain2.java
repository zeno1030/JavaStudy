package lang.immutable.address;

public class RefMain2 {
	public static void main(String[] args) {
		ImmutableAddress address = new ImmutableAddress("서울");
		ImmutableAddress b = address;

		System.out.println("address = " + address);
		System.out.println("b = " + b);

		b = new ImmutableAddress("부산");
		System.out.println("address = " + address);
		System.out.println("b = " + b);
	}
}
