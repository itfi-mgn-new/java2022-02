package lesson11;

import java.io.Serializable;

public class House implements Serializable {
	String	address;

	public House(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "House [address=" + address + "]";
	}
}
