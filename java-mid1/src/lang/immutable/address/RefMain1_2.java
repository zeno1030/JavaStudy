package lang.immutable.address;

public class RefMain1_2 {
	public static void main(String[] args) {
		Address addressA = new Address("서울");
		Address addressB = new Address("서울");

		System.out.println("address = " + addressA);
		System.out.println("b = " + addressB);

		addressB.setValue("부산");
		System.out.println("address = " + addressA);
		System.out.println("b = " + addressB);
	}
}
