package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작됨");

		// Thread 클래스를 상속받은 익명의 클래스를 이용해서
		// Thread type 의 참조값 얻어내기
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("새로운 작업 단위임!");
			}
		};
		t1.start();

//		synchronized
		new Thread() {
			@Override
			public void run() {
				System.out.println("새로운 작업 단위  2");
			}
		}.start();
		
		System.out.println("main 스레드가 종료 됩니다.");
	}
}
