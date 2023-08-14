package com.jave.jse;

public class SubScore extends Score {
	
	// 필드
	int hist;
	int soc;
	int sci;
	
	// 기본 생성자
	public SubScore() {}
	
	// 오버로딩 생성자
	public SubScore(int hist, int soc, int sci, int kor, int eng, int math) {
		this.hist = hist;
		this.soc = soc;
		this.sci = sci;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
	}

	@Override
	public String toString() {
		return "SubScore [hist=" + hist + ", soc=" + soc + ", sci=" + sci + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
}
