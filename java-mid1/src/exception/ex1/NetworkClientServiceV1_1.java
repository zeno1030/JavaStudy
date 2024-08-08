package exception.ex1;


public class NetworkClientServiceV1_1 {
	public void sendMessage(String data) {
		String address = "https://address.com";
		NetworkClientV1 client = new NetworkClientV1(address);
		client.initError(data);

		client.connect();
		client.send(data);
		client.disconnect();
	}
}
