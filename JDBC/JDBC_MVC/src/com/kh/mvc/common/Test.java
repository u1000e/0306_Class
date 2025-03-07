package com.kh.mvc.common;

public class Test {
	
	public static void main(String[] args) {
		
		//출석부르기 출석 = new 출석부르기();
		/*
		출석.call현우();
		출석.call관민();
		출석.call구남();
		*/
		//출석.전부부르기();
		/*
		
		식당 식당 = new 서브웨이();
		식당.점심메뉴고르기();
		서브웨이 서브웨이 = new 서브웨이();
		서브웨이.점심메뉴고르기();
		*/
		
		중간다리 중간다리 = new 중간다리(new 편의점());
		중간다리.점심메뉴출력();
		중간다리.toString();
		String abc = "하하호호";
		if("하하호호".equals(abc)) {
			abc.equals("하하호호");
		}
	}

}
