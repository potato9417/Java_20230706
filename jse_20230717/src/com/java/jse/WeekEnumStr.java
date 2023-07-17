package com.java.jse;

public enum WeekEnumStr {

	MONDAY("MON"),
	TUESDAY("TUES"),
	WEDENSDAY("WED"),
	THURSDAY("THU"),
	FRIDAY("FRI"),
	SATURDAY("SAT"),
	SUNDAY("SUN");
	
	private final String value;

	WeekEnumStr(String value){
		this.value=value;
	}

	public String getValue() {
		return this.value;
	}
}
