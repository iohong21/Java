package test.main;

import test.mypac.*;

public class MainClass07 {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		HandPhone p2 = new HandPhone();
		SmartPhone p3 = new SmartPhone();
		
		// 메소드 호출하면서 변수에 담기 참조값 전달
		usePhone(p1);
		usePhone(p2);
		usePhone(p3);
		
		// 메소드 호출하면서 객체를 생성해서 참조값 전달
		usePhone(new Phone());
		usePhone(new HandPhone());
		usePhone(new SmartPhone());
		
		// NullPointerException 발생
		usePhone(null);
	}
	
	public static void usePhone(Phone p) {
		p.call();
	}
}
