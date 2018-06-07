// 한줄 주석 

/*
 * 
 * 여러줄 주석
 */

// 빨간색으로 표시되는 단어는 예약어 입니다.
package test.main;		// package 예약어를 이용해서 패키지 표시

// 클래스 식별자(이름) 은 MainClass 입니다
public class MainClass {// 클래스의 시작
	private static void msg(String pMsg) {
		System.out.println(pMsg);
	}
	
	// run 했을때 실행순서가 들어오는 main 메소드 정의 하기
	public static void main(String[] args) {
		msg("main 메소드가 시작 됩니다.");
		msg("하나");
		msg("두울");
		msg("세엣");
		msg("main 메소드가 종료 됩니다.");
	}
}// 클래스의 끝
