package com.kh.mvc.study;

public class A extends B{
	
	private int a;
	
	{
		this.a = 10;
		System.out.println("안뇽 나는 초기화 블록");
	}
	
	static {
		System.out.println("안뇽 나는 스태틱 블록");
	}
	
	public A() {
		System.out.println("안뇽 나는 자식 생성자");
	}
	
	public void print() {
		System.out.println("나는 자식 A꺼");
	}
	

}
