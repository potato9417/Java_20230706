package com.java.jse;

public enum WeekEnum {
	
	// 기본 enum : 값을 따로 지정해주지않음(0부터~)
//	MONDAY,
//	TUESDAY,
//	WEDENSDAY,
//	THURSDAY,
//	FRIDAY,
//	SATURDAY,
//	SUNDAY;

	// 값을 지정해 주고싶을때 사용
	MONDAY(1),
	TUESDAY(2),
	WEDENSDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);
	
	private final int value;

	WeekEnum(int value){
		this.value=value;
	}

	// getValue()는 pulic으로 사용하는 것이 좋음
	public int getValue() {
		return this.value;
	}
}
