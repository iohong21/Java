package test.main;

import test.mypac.SubWorker;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 스레드가 시작됨");
		
		// 새로운 작업단위 시작 시키기
		new SubWorker("1").start();
		new SubWorker("2").start();
		new SubWorker("3").start();
		
		System.out.println("메인 스레드가 종료 됩니다.");
	}
}
