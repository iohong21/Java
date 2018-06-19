package test.main;

import java.io.*;

public class MainClass04 {
	public static void main(String[] args) {
		// PrintStream 객체의 참조값을 부모 type 인 
		// OutputStream type 으로 받아서 테스트 하기
		OutputStream os = System.out;
		
		try {
			// 출력할 준비
			os.write(97);
			os.write(98);
			os.write(99);
			os.write(100);
			os.write(101);
			// 출력 준비가된 문자열 출력
			os.flush();
			
			CR(os);
			
			// 방 5개짜리 byte[] 객체를 생성해 보세요.
			byte[] nums = new byte[5];
			
			nums[0] = 102;
			nums[1] = 103;
			nums[2] = 104;
			nums[3] = 105;
			nums[4] = 106;
			// .write() 메소드 호출하면서  byte[] 객체 전달
			os.write(nums); 	// 배열은 auto flush 기능 있음
			
			CR(os);
			
			// .write(byte[], 시작인덱스, 갯수)
			os.write(nums, 1, 2);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//		System.out.println("\nmain 메소드가 종료 됩니다.");
	}
	static void CR(OutputStream os) {
		try {
			os.write(13);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
