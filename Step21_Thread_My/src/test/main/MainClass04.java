package test.main;

import test.mypac.Player;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작됨");
		
		Thread p1 = new Player("김구라");		// 스레드 객체 생성해서
		p1.start();							// 시작 시키기
		
		Thread p2 = new Player("해골");
		p2.start();
		
		System.out.println("main 스레드가 종료 됩니다.");
	}
}
