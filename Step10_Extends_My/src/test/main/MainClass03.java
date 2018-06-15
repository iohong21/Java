package test.main;

import test.mypac.*;

/*
 * [ 다형성 (Polymorphism) ]
 * 
 * - java 에서 객체의 참조값은 다형성을 가지 수 있다.
 * - 다형성이란 여러가지 type 이 될 수 있다는 의미이다
 */
public class MainClass03 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// SmartPhone 객체의 참조값을 부모 type 변수에 대입하기
		// p1 에 . 찍으면 Object 에 정의된 기능만 사용 가능
		Object p1 = new SmartPhone();
		
		// p2 에 . 찍으면 Object, Phone 에 정의된 기능만 사용 가능
		Phone p2 = new SmartPhone();
		
		// p3 에 . 찍으면 Object, Phone, HandPhone에 정의된 기능만 사용 가능
		HandPhone p3 = new SmartPhone();
		
		// SmartPhone 객체의 참조값을  SmartPhone type 변수에 대입하기
		// p4 에 . 찍으면 Object, Phone, HandPhone, SmartPhone
		// 에 정의된 모든 기능 사용 가능
		SmartPhone p4 = new SmartPhone();
		
	}
}
