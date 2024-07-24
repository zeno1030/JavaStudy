package lang.wrapper;

public class WrapperVsPrimitive {
	public static void main(String[] args) {
		int iterations = 1_000_000_000; //반복횟수
		long startTime, endTime;

		long sumPrimitive = 0;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			sumPrimitive += i;
		}
		endTime = System.currentTimeMillis();
		System.out.println("sumPrimitive = " + sumPrimitive);
		System.out.println("(startTime - endTime) = " + (endTime - startTime));

		//wrapper 클래스 long 사용
		Long sumWrapper = 0L;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			sumWrapper += i;
		}
		endTime = System.currentTimeMillis();
		System.out.println("sumWrapper = " + sumWrapper);
		System.out.println("(startTime - endTime) = " + (endTime - startTime));
	}
}
