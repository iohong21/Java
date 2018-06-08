package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		printMsg();
		printMsg2("안녕하세요");
	}
	
	public static void printMsg() {
		System.out.println("메세지를 출력합니다.");
	}
	
	public static void printMsg2(String msg) {
		System.out.println("msg: " + msg);
	}
}
