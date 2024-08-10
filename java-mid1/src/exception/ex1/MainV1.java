package exception.ex1;

import java.util.Scanner;

public class MainV1 {
	public static void main(String[] args) {
		NetworkClientServiceV1_1 networkService = new NetworkClientServiceV1_1();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("전송할 문자: ");
			String input = scanner.nextLine();
			if (input.equals("exit")) {
				break;
			}
			networkService.sendMessage(input);
			System.out.println();
		}
		
		System.out.println("프로그램을 정상종료 합니다.");
	}
}
