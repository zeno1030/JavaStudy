package nested.nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {

	public static void hello(Process process) {
		System.out.println("프로그램 시작");
		process.run();
		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		hello(() -> {
			int randomValue = new Random().nextInt(6) + 1;
			System.out.println("randomValue = " + randomValue);
		});
		hello(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("i = " + i);
			}
		});
	}
}
