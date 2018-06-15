package test.main;

import java.util.Random;
import java.util.Scanner;
import test.mypac.AttackUnit;

public class MainClass10 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		// 기본 data type
		int num = 10;
		boolean isRun = true;
		char ch = 'A';
		
		// 참조 data type
		Random ran = new Random();
		String name = "김구라";
		AttackUnit unit = new AttackUnit();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	}
}
