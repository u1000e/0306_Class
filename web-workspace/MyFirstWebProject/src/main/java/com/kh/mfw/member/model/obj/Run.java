package com.kh.mfw.member.model.obj;

public class Run {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setAge(20);
		s.setName("홍길동");
		
		
		Student t = new Student("고길동", 50);
		
	}

}
