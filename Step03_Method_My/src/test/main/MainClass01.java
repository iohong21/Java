package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		/*
		 * static 예약어가 붙은 메소드를 호출하는 방법
		 * 
		 * 클래스명.메소드명();
		 * 
		 * ex)
		 * MainClass01.a();
		 */
		MainClass01.a();
		/*
		 * 동일한 클래스 안에 존재한느 static 메소드를 호출할 때는 
		 * 클래스명. 은 생략 가능
		 */
		b();
		
//		MainClass01 mc = new MainClass01();
//		mc.z();
		
		System.out.println("main 메소드가 종료(return) 됩니다.");
	}
	
	// a 메소드
	protected static void a() {
		System.out.println("a 메소드가 시작 되었습니다.");
		
		System.out.println("a 메소드가 종료(return) 됩니다.");
	}
	
	// b 메소드
	protected static void b() {
		System.out.println("b 메소드가 시작 되었습니다.");
		
		System.out.println("b 메소드가 종료(return) 됩니다.");
	}
	
//	// z 메소드
//	void z() {
//		System.out.println("z 메소드가 시작 되었습니다.");
//		
//		System.out.println("z 메소드가 종료(return) 됩니다.");
//	}
}
