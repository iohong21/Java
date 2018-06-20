package test.main;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작됨");

		// 익명의 inner class 를 이용해서 Runnable type 참조값 얻어내기
		Runnable run1 = new Runnable( ) {
			@Override
			public void run() {
				System.out.println("새로운 작업 단위임!");
			}
		};
		new Thread(run1).start();
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("두번째 작업");
			}
		}).start();
		
		System.out.println("main 스레드가 종료 됩니다.");
	}
}
