package test.main;

@SuppressWarnings("unused")
public class MainClass01 {
	// 필드
	public int num = 10;
	
	// static 필드
	public static int num2 = 20;
	
	// static main 메소드
	public static void main(String[] args) {
		// static 메소드 안에서는 static 자원들만 참조 가능
		// int result = this.num;
		
		// 참조가능
		int result2 = MainClass01.num2;
		
		// 내부 클래스로 객체 생성가능
		new Gura();
	}
	
	public static class Gura{
	}
}
