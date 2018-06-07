package test.main;
/*
 * [ 기본 data type VS 참조 data type ]
 * 
 * 기본 data type 변수에는 실제로 값이 들어 있고
 * 참조 data type 변수에는 id값(참조값) 이 들어있다.
 * 
 */
public class MainClass05 {
	public static void F(int n) {
		n = n + 1;
		System.out.println(n);
	}
	public static void S(String s) {
		s = "Test";
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// 기본 data type 변수에 값 대입하기
		int num1 = 10;
		double num2 = 10.1;
		boolean isRun = true;
		char ch1 = 'A';
		
		// 참조 data type 변수에 값 대입하기
		String myName = "김구라";
		
		
		F(num1);
		System.out.println(num1);
		
		S(myName);
		System.out.println(myName);
	}
}
