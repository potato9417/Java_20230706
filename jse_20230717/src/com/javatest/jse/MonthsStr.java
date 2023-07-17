package com.javatest.jse;

public enum MonthsStr {
	
	JANUARY("JAN"),
	FEBUARY("FEB"),
	MARCH("MAR"),
	APRIL("APR"),
	MAY("MAY"),
	JUNE("JUN"),
	JULY("JUL"),
	AUGUST("AUG"),
	SEPTEMBER("SEP"),
	OCTOBER("OCT"),
	NOVEMBER("NOV"),
	DECEMBER("DEC");
	
	// enum의 값을 넣어줄 경우 value값을 꼭 정의해줘야함
	// final : 상수(js에서 const) 
	private final String value;
	
	
	MonthsStr(String value){
		this.value = value;
	}
	
	// value값을 가지고오기위한 메서드
	public String getValue() {
		return this.value;
	}
	

}
