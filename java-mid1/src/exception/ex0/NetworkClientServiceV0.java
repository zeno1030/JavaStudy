package exception.ex0;

public class NetworkClientServiceV0 {
	public void sendMessage(String data) {
		String address = "https://address.com";
		NetworkClientV0 client = new NetworkClientV0(address);

		client.connect();
		client.send(data);
		client.disconnect();
	}
}
