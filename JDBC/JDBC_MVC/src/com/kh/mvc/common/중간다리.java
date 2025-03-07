package com.kh.mvc.common;

public class 중간다리 {
	
	private 식당 식당;
	
	public 중간다리(식당 식당) {
		this.식당 = 식당;
	}
	
	public void 점심메뉴출력() {
		식당.점심메뉴고르기();
	}

}
