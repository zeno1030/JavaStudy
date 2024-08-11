package exception.ex1;


public class NetworkClientServiceV1_3 {
	public void sendMessage(String data) {
		NetworkClientV1 client = new NetworkClientV1("https://address.com");
		client.initError(data);

		String connectResult = client.connect();
		//결과가 성공이 아니다.
		if (isError(connectResult)) {
			System.out.println("[네트워크 오류 발생] 오류 코드 : connectResult : " + connectResult);
		}
		String sendResult = client.send(data);
		if (isError(sendResult)) {
			System.out.println("[네트워크 오류 발생] 오류 코드 : sendResult : " + sendResult);
		}

		client.disconnect();
	}

	private static boolean isError(String connectResult) {
		return !connectResult.equals("success");
	}
}
