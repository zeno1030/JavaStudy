package lang.string.builder;

public class LoopStringBuilderMain {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			result.append("Hello world");
		}
		long endTime = System.currentTimeMillis();
		String string = result.toString();
		System.out.println("string = " + string);
		System.out.println("(endTime - startTime) =  " + (endTime - startTime));
	}
}
