package packet;

public class packetHeader {
	int x;
	String name;
	
	public String getData() {
		return name;
	}
	
	public packetHeader(String data) {
		x = 100;
		name = data;
	}
}
