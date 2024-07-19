package lang.immutable.address;

public class RefMain1_3 {
	public static void main(String[] args) {
		Address addressA = new Address("서울");
		Address addressB = addressA;

		System.out.println("address = " + addressA);
		System.out.println("b = " + addressB);

		change(addressB, "부산");
		System.out.println("address = " + addressA);
		System.out.println("b = " + addressB);
	}

	private static void change(Address address, String changeAddress) {
		address.setValue(changeAddress);
	}
}
