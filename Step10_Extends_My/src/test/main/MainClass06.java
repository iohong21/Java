package test.main;

import test.mypac.*;

public class MainClass06 {
	public static void main(String[] args) {
		// HandPhone 객체 생성해서 HandPhone type 변수에 대입
		HandPhone hPhone = new HandPhone();
		
		// 실행시 Exception 발생
		SmartPhone p1 = (SmartPhone)hPhone;
		p1.doInternet();
	}
}
