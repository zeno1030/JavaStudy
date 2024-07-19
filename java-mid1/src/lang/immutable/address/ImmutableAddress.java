package lang.immutable.address;

public record ImmutableAddress(String value) {

	@Override
	public String toString() {
		return "Address{" +
			"value='" + value + '\'' +
			'}';
	}
}
