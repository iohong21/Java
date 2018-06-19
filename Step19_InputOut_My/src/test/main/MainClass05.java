package test.main;

import java.io.*;

public class MainClass05 {
	public static void main(String[] args) {
		OutputStream os = System.out;
		
		// 생성자로의 인자로 OutputStream 객체를 전달해서
		// OutputStreamWriter 객체 생성하기
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		try {
			osw.write("abcd 1234 한글도 출력되네?");
			osw.flush();
			
			CR(osw);
			
			// 방 5개짜리 char[] 객체를 생성해 보세요.
			char[] b = new char[5];
			
			// 각각의 방에 char type 대입
			b[0] = 'A';
			b[1] = 'B';
			b[2] = 'C';
			b[3] = 'D';
			b[4] = 'E';
			// char[] 객체 전달해서
			osw.write(b); 
			osw.flush();	// 출력하기
			
			CR(osw);
			
			// .write(char[], 시작인덱스, 갯수)
			osw.write(b, 1, 2);
			osw.flush();
			
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
	static void CR(OutputStreamWriter osw) {
		try {
			osw.write("\n");
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
