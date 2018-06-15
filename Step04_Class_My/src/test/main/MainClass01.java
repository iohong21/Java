package test.main;

import test.mypac.MyUtil;
/*
 * [ 클래스의 용도 ]
 * 
 * 1. static 멤버를 포함하는 기능
 * 2. 객체의 설계도 역활
 * 3. data type 역활 
 */
public class MainClass01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// MyUtil 클래스의 version 이라는 필드에 있는 값을
		// 참조해서 a 라는 이름의 지역 변수에 담기
		int a = MyUtil.version;
		
		// MyUtil 클래스의 clean() 메소드 호출하기
		MyUtil.clean();
	}
}
