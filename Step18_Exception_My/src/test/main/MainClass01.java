package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * [ Exception 처리 문법 ]
 * 
 * try {
 *     Exception  이 발생할 가능성이 있는 코드 블럭
 *     .
 *     .
 * } catch(Exception type 변수명) {
 *     Exception 이 발생했을 때 실행할 코드 블럭
 * }
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 키보드로 부터 입력 받을 Scanner 객체
		Scanner scan = new Scanner(System.in);
	
		try {
			System.out.print("나눌 수 입력: ");
			int num1 = scan.nextInt();
			System.out.print("나누어 지는 수 입력: ");
			int num2 = scan.nextInt();
			
			// num2 를 num1 으로 나눈 몫
			int mok = num2 / num1;

			// num2 를 num1 으로 나눈 나머지
			int na = num2 % num1;

			System.out.println(num2 + "를 " + num1 + " 으로 나눈 결과");
			System.out.println("몫: " + mok + "나머지: " + na);
		} catch(ArithmeticException ae) {
			System.out.println("어떤 수를 0 으로 나눌 수는 없어요");
		} catch(InputMismatchException ime) {
			System.out.println("숫자 형식으로 입력해 주세요");
		}
		System.out.println("main 메소드가 종료됩니다.");
		scan.close();
	}
}
