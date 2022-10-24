package io.appium.java_client.android;

public enum Connection {
	NONE(0),
	AIRPLANE(1),
	WIFI(2),
	DATA(4),
	ALL(6);

	final int bitMask;

	Connection(int bitMask) {
		// TODO Auto-generated constructor stub
		this.bitMask= bitMask;
	}
}
