package test.main;

import java.util.*;

public class MainClass08 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 키보드로 부터 문자열을 입력받을 객체
		Scanner scan = new Scanner(System.in);
		
		// 입력한 모든 문자열의 내용을 가지고 있는 String 객체
		String msg = "";
		
		while(true) {
			System.out.print("한줄입력(종료:q): ");
			
			// 문자열을 한줄 입력 받아서
			String str = scan.nextLine();
			
			if(str.equals("q")) {
				// q 를 입력하면 반복문 탈출
				break;
			}

			/*
			 *   <<  중요함   >>
			 * 
			 * 문자열을 + 하면 새로운 객체가 생성되고 이전의 문자열은 garbage가 된다.
			 */
			msg += str;
		}
		// 입력된 내용 출력하기
		System.out.println("msg: " + msg);
	}
}
